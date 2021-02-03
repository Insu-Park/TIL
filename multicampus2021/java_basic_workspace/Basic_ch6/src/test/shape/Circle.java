package test.shape;

public class Circle extends Shape{
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public void area() {
		System.out.println("원의 넓이="+(3.14*radius*radius));
	}
}