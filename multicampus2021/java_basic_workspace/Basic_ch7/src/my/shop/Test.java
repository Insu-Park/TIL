package my.shop;

public class Test {

	public static void main(String[] args) {
		
		Monitor m = new Monitor();
		Vip cust1 = new Vip();
		Guest cust2 = new Guest();
		Black cust3 = new Black();
		m.monitorPoint(cust1);
		m.monitorPoint(cust2);
		m.monitorPoint(cust3);
	}

}
