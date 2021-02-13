package com.scsa.java.fifth;

/* 
 * 멀티캠퍼스 온·오프 연계 AI활용 지능형 서비스 개발
 * 
 * AI 서비스를 위한 기반 언어 프로그래밍 과제
 * 
 * 교육생 박인수  
 * 
 */

public class BookTest {

	public static void main(String[] args) throws Exception {
		
		Book[] book = new Book[5];
		Magazine[] magazine = new Magazine[5];
		
		
		// 원래는 BookList 클래스를 만들어서 관리하고 입력을 파일 입출력이나 Program Argument로 받으면 좋겠지만
		// 과제에서 다른 클래스나 메소드를 추가하면 안될 것 같아 부득이하게 단순 코드 반복을 하였습니다. 
		
		try {
			book[0] = new Book("21424", "Java Basic", "김하나", "Jaen.kr", 15000, "기본문법");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			book[1] = new Book("33455", "JDBC Pro", "김철수", "Jaen.kr", 23000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			book[2] = new Book("55355", "Servlet/JSP", "박자바", "Jaen.kr", 41000, "Model12 기반");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			book[3] = new Book("35332", "Android App", "홍길동", "Jaen.kr", 25000, "Lightweight Framework");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			book[4] = new Book("35355", "OOAD 분석, 설계", "소나무", "Jaen.kr", 30000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			magazine[0] = new Magazine("35535", "Java World", "편집부", "Jaen.kr", 7000, 2013, 2);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			magazine[1] = new Magazine("35434", "Mobile World", "편집부", "Jaen.kr", 8000, 2013, 8);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			magazine[2] = new Magazine("75342", "Next Web", "편집부", "Jaen.kr", 10000, 2012, 10);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			magazine[3] = new Magazine("76543", "Architecture", "편집부", "Jaen.kr", 5000, 2010, 3);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			magazine[4] = new Magazine("76534", "Data Modeling", "편집부", "Jaen.kr", 14000, 2012, 12);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
				
		System.out.println("*************** 도서 목록 ***************");
		for(int i=0; i<book.length; i++) {
			System.out.println(book[i].toString());
		}
		System.out.println();
		System.out.println("*************** 잡지 목록 ***************");
		for(int i=0; i<magazine.length; i++) {
			System.out.println(magazine[i].toString());
		}
	}

}
