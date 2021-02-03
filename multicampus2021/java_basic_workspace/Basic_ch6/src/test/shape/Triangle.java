package test.shape;

public class Triangle extends Shape{
	private int w,h;
	public Triangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	public void area() {
		System.out.println("사각형의 넓이="+(w*h/2));
	}

}