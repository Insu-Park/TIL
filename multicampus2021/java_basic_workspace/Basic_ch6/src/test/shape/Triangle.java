package test.shape;

public class Triangle {
	private int w,h;
	public Triangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	public void areaTri() {
		System.out.println("사각형의 넓이="+(w*h/2));
	}

}