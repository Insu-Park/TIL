package my.fly;

public class Airplane extends Vehicle implements Flyer{	
	
	@Override
	public void fly() {
		int distance=transfer(10,1000);
		System.out.println(distance+"거리만큼 엔진을 가동해서 난다...");
		
	}

}
