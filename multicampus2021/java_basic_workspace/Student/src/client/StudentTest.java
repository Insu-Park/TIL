package client;

import common.entity.StudentDTO;
import server.dao.StudentDAO;

public class StudentTest {

	public static void main(String[] args) throws Exception {
		
		StudentDAO s = new StudentDAO();
		s.insertStudent(new StudentDTO(3, "나길동", "영문학과", "제주", "010-3333-3333"));
		s.printAllStudent();
		
	}

}