package com.scsa.java.fifth;

/* 
 * 멀티캠퍼스 온·오프 연계 AI활용 지능형 서비스 개발
 * 
 * AI 서비스를 위한 기반 언어 프로그래밍 과제
 * 
 * 교육생 박인수  
 * 
 */

public class Magazine {

	String isbn = "";
	String title = "";
	String author = "";
	String publisher = "";
	int year = 1;
	int month = 1;
	int price = 0;
	String desc = "";

	public String toString() {
		return isbn + "\t| " + title + "\t| " + author + "\t| " + publisher + "\t| " + price + "\t| " + year + "." + month + "\t| " + desc;
	}
	
}
