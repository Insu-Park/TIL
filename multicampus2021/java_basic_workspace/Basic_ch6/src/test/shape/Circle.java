package test.shape;

public class Circle {
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public void areaCircle() {
		System.out.println("���� ����="+(3.14*radius*radius));
	}
}