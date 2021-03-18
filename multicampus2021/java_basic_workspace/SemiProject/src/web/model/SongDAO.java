package web.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import web.vo.MemberVO;
import web.vo.SongVO;
import web.util.MyException;

public class SongDAO {

	DataSource dbcp;
	
	public SongDAO() throws MyException {
		try {
			Context ic=(Context) (new InitialContext()).lookup("java:comp/env");
			dbcp=(DataSource) ic.lookup("jdbc/oracle");
		} catch (NamingException e) {			
			e.printStackTrace();
			throw new MyException("connection pool 찾기 오류");
		}
	}
	
	public String getRate(SongVO s) throws MyException {
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try {
			con=dbcp.getConnection();
			stmt=con.prepareStatement("select rate, count from song where title=? and attcode=? ");
			stmt.setString(1, s.getTitle());
			stmt.setInt(2, s.getAttcode());
			rs=stmt.executeQuery();
			if(rs.next()) {
				double rate = rs.getDouble(1);
				int count = rs.getInt(2);
				return Double.toString(Math.round((rate / count) * 10) / 10.0);
			}
			return null;		
		}catch(SQLException e) {
			e.printStackTrace();
			throw new MyException("평점 불러오기 실패");
		}finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				
			}
		}		
	}
	
	public String rateInsert(MemberVO m, SongVO s) throws MyException {
		System.out.println("1");
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		System.out.println("1");
		try {
			System.out.println("1");
			con=dbcp.getConnection();
			System.out.println("1");
			stmt=con.prepareStatement("select count(*) from ratelist where title=? and attcode=? and memid=? ");
			stmt.setString(1, s.getTitle());
			stmt.setInt(2, s.getAttcode());
			stmt.setString(3, m.getId());
			System.out.println("1");
			rs=stmt.executeQuery();
			System.out.println("1");
			if(rs.next()) {
				if(rs.getInt(1) == 0) {
					
					stmt=con.prepareStatement("insert into ratelist(title,attcode,memid) values(?,?,?) ");
					stmt.setString(1, s.getTitle());
					stmt.setInt(2, s.getAttcode());
					stmt.setString(3, m.getId());
					System.out.println("3");
					stmt.executeUpdate();
					System.out.println("4");
					
					stmt=con.prepareStatement("update song set count=count+1 where title=? and attcode=? ");
					stmt.setString(1, s.getTitle());
					stmt.setInt(2, s.getAttcode());
					stmt.executeUpdate();
					
					stmt=con.prepareStatement("update song set rate=rate+? where title=? and attcode=? ");
					stmt.setDouble(1, s.getRate());
					stmt.setString(2, s.getTitle());
					stmt.setInt(3, s.getAttcode());
					stmt.executeUpdate();
					
					con.commit();
					return "평가 완료!";
				} else {
					return "이미 평가한 곡입니다.";
				}
			}
			return null;
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw new MyException("회원가입 실패");
		}finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				
			}
		}		
		
	}

	
}
