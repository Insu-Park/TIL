package my.model;

public class PersonImpl implements Person{

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public PersonImpl(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public PersonImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonImpl(String name) {
		super();
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
