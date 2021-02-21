package server.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.entity.StudentDTO;

public class StudentDAO {

	public StudentDAO() throws Exception {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			throw new Exception("드라이버 등록 실패");
		}
	}
	
	public void insertStudent(StudentDTO s) throws Exception {
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","student","1234");
			stmt=con.prepareStatement("insert into student(no,name,det,addr,tel) values(?,?,?,?,?) ");
			stmt.setInt(1, s.getNo());
			stmt.setString(2, s.getName());
			stmt.setString(3, s.getDet());
			stmt.setString(4, s.getAddr());
			stmt.setString(5, s.getTel());
			
			int i=stmt.executeUpdate();
			System.out.println(i+"행이 insert되었습니다.");
		} catch (SQLException e) {			
			e.printStackTrace();
			throw new Exception("학생 등록 실패");
		}finally {
			try {
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				
			}
		}
	}
	
	public void printAllStudent() throws Exception{
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","student","1234");
			stmt=con.prepareStatement("select * from student");		
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5));
			}
		} catch (SQLException e) {			
			e.printStackTrace();
			throw new Exception("학생 레코드 조회 실패");
		}finally {
			try {
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				
			}
		}
	}
}
