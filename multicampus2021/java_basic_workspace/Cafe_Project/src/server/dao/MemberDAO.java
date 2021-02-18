package server.dao;

import java.sql.*;

import common.entity.Member;
import common.util.CafeException;

public class MemberDAO {
	
	public MemberDAO() throws CafeException {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			throw new CafeException("오라클 드라이버 등록 실패");
		}
	}
	
	public void insertMember(Member m) throws CafeException {
		try {
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cafe","1234");
			PreparedStatement stmt=con.prepareStatement("insert into member values(?,?,?,?,?)");
			stmt.setString(1, m.getMemId());
			stmt.setString(2, m.getName());
			stmt.setDate(3, new Date(m.getmDate().getTime()));
			stmt.setString(4,  m.getPhone());
			stmt.setInt(5, m.getPoint());
			
			int i=stmt.executeUpdate();
			System.out.println(i+"행이 insert되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CafeException("insertMember 실패");
		}
	}
	

}
