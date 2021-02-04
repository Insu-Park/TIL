package test.constructor;

public class Korean {
	String nation="대한민국";
	String name;
	String ssn;
	
	public Korean(String n,String s) {
		name=n;
		ssn=s;
	}

	public Korean() {
		this("홍길동", "000000-0000000");
	}
}
