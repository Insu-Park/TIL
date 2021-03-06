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

	public static void main(String[] args) {
		
		Book b1 = new Book();
		Book b2 = new Book();
		Magazine m1 = new Magazine();
		
		b1.isbn = "21424";
		b1.title = "Java Pro";
		b1.author = "김하나";
		b1.publisher = "Jaen.kr";
		b1.price = 15000;
		b1.desc = "기본문법";
		
		b2.isbn = "35355";
		b2.title = "OOAD 분석,설계";
		b2.author = "소나무";
		b2.publisher = "Jaen.kr";
		b2.price = 30000;
		
		m1.isbn = "35535";
		m1.title = "Java World";
		m1.author = "편집부";
		m1.publisher = "androidjava.com";
		m1.year = 2013;
		m1.month = 2;
		m1.price = 7000;
		
		System.out.println("*************** 도서 목록 ***************");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(m1);
	}

}
