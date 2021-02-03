package test.shape;

public class Rectangle extends Shape{
	private int w,h;
	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	public void area() {
		System.out.println("삼각형의 넓이="+(w*h));
	}

}