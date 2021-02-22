/* 
 * 멀티캠퍼스 온·오프 연계 AI활용 지능형 서비스 개발
 * 
 * AI 서비스를 위한 기반 언어 프로그래밍 과제
 * 
 * 교육생 박인수  
 * 
 */

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