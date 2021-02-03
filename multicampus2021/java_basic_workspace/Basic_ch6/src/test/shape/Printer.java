package test.shape;

public class Printer {
	
	public void print(Object o) {
		if(o instanceof Circle) {
			Circle c = (Circle) o;
			c.radius = 5;
			c.areaCircle();
		}else if(o instanceof Rectangle) {
			Rectangle r = (Rectangle) o;
			r.h=3;
			r.w=4;
			r.areaRec();
		}else if(o instanceof Triangle) {
			Triangle t = (Triangle) o;
			t.h=8;
			t.w=2;
			t.areaTri();
		}
	}

}
