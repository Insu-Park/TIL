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

	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String desc = "";
	private int year;
	private int month;
	
	public Magazine(String isbn, String title, String author,
			String publisher, int price, String desc, int year, int month) throws Exception{
		setIsbn(isbn);
		setTitle(title);
		setAuthor(author);
		setPublisher(publisher);
		setPrice(price);
		setDesc(desc);
		setYear(year);
		setMonth(month);
	}
	
	public Magazine(String isbn, String title, String author,
			String publisher,  int price, int year, int month) throws Exception{
		setIsbn(isbn);
		setTitle(title);
		setAuthor(author);
		setPublisher(publisher);
		setPrice(price);
		setYear(year);
		setMonth(month);
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) throws Exception {
		if(isbn==null) throw new Exception("isbn이 입력되지 않았습니다!");
		else if(isbn.length() != 5) throw new Exception("isbn을 잘못 입력했습니다!");
		// DB를 연동한다면 isbn값이 중복되는지 검사하는 등을 수행
		else this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception {
		if(title==null) throw new Exception("title이 입력되지 않았습니다!");
		else if("".equals(title)) throw new Exception("title에 공백값을 입력할 수 없습니다!");
		else this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) throws Exception {
		if(author==null) throw new Exception("author가 입력되지 않았습니다!");
		else if("".equals(author)) throw new Exception("author에 공백값을 입력할 수 없습니다!");
		else this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) throws Exception {
		if(publisher==null) throw new Exception("publisher가 입력되지 않았습니다!");
		else if("".equals(publisher)) throw new Exception("publisher에 공백값을 입력할 수 없습니다!");
		else this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) throws Exception {
		if(price <= 0 && price >= 10000000) throw new Exception("price가 잘못 입력되었습니다!");
		else this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) throws Exception {
		if(desc==null) throw new Exception("desc가 입력되지 않았습니다!");
		this.desc = desc;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) throws Exception {
		if(year < 1900 && year > 2021) throw new Exception("year가 잘못 입력되었습니다!");
		// 시스템 시간 호출해서 비교도 가능
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) throws Exception {
		if(month < 1 && month > 12) throw new Exception("month가 잘못 입력되었습니다!");
		this.month = month;
	}
	
	public String toString() {
		return isbn + "\t| " + title + "\t| " + author + "\t| " + publisher
				+ "\t| " + price + "\t| " + desc + "\t| " + year + "." + month;
	}
	
}
