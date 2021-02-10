package com.scsa.java.fifth;

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
