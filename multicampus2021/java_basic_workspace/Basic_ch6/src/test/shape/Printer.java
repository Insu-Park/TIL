package test.shape;

public class Printer {
	
	public void print(Object o) {
		if(o instanceof Circle) {
			Circle c = (Circle) o;
			c.areaCircle();
		}else if(o instanceof Rectangle) {
			Rectangle r = (Rectangle) o;
			r.areaRec();
		}else if(o instanceof Triangle) {
			Triangle t = (Triangle) o;
			t.areaTri();
		}
	}

}