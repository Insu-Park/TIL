package web.vo;

import java.util.Date;

public class Member {
	
	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	private String id,pw,name;
	private Date date;
	
		
	public Member(String id, String pw, String name, Date date) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.date = date;
	}
	
	public Member(String str, int flag) {
		super();
		if(flag==0) this.id = str;
		if(flag==1) this.pw = str;
	}


	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String id2, String pw2, String name2) {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}