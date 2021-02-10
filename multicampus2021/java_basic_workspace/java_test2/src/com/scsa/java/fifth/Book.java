package com.scsa.java.fifth;

public class Book {

	String isbn = "";
	String title = "";
	String author = "";
	String publisher = "";
	int price = 0;
	String desc = "";
	
	public String toString() {
		return isbn + "\t| " + title + "\t| " + author + "\t| " + publisher + "\t| " + price + "\t| " + desc;
	}
	
}
