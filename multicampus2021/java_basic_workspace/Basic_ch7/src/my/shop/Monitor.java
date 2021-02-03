package my.shop;

public class Monitor {

	public void monitorPoint(Customer c) {
		c.calcPoint();
	}
	
	public void monitorPoint(Vip c) {
		c.calcPoint();
	}
	
	public void monitorPoint(Black c) {
		c.calcPoint();
	}
}
