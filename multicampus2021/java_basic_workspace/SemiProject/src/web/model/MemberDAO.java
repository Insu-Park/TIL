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
import web.util.MyException;

public class MemberDAO {

	DataSource dbcp;
	
	public MemberDAO() throws MyException {
		try {
			Context ic=(Context) (new InitialContext()).lookup("java:comp/env");
			dbcp=(DataSource) ic.lookup("jdbc/oracle");
		} catch (NamingException e) {			
			e.printStackTrace();
			throw new MyException("connection pool 찾기 오류");
		}
	}
	
	public String login(String id, String pw) throws MyException {
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try {
			con=dbcp.getConnection();
			stmt=con.prepareStatement("select memname from member where memid=? and pw=? ");
			stmt.setString(1, id);
			stmt.setString(2, pw);
			rs=stmt.executeQuery();
			if(rs.next()) {
				return rs.getString(1);
			}
			return null;		
		}catch(SQLException e) {
			e.printStackTrace();
			throw new MyException("로그인 실패");
		}finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				
			}
		}		
	}

	public void memberInsert(MemberVO m) throws MyException {
		Connection con=null;
		PreparedStatement stmt=null;
		
		try {
			con=dbcp.getConnection();
			stmt=con.prepareStatement("insert into member(memid,pw,memname,memnick,email) values(?,?,?,?,?)  ");
			stmt.setString(1, m.getId());
			stmt.setString(2, m.getPw());
			stmt.setString(3, m.getName());
			stmt.setString(4, m.getNick());
			stmt.setString(5, m.getEmail());
			int i=stmt.executeUpdate();
			con.commit();
		}catch(SQLException e) {
			e.printStackTrace();
			throw new MyException("회원가입 실패");
		}finally {
			try {
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				
			}
		}		
		
	}
	
}
