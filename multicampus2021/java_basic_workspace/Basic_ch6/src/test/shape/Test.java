package test.shape;

public class Test {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		Rectangle r = new Rectangle(3, 4);
		Triangle t = new Triangle(8, 2);
		Printer out = new Printer();
		out.print(c);
		out.print(r);
		out.print(t);

	}

}