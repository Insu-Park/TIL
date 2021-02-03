package test.shape;

public class Triangle extends Shape{
	private int w,h;
	public Triangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public void area() {
		System.out.println("사각형의 넓이="+(w*h/2));
	}

}