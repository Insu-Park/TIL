package test.exception;

public class Test {

	public static void main(String[] args) {
		try {
			int x=100;
			int y=0;
			System.out.println(x/y);
		}catch(ArithmeticException e) {
			
		}
		System.out.println("아주 중요한 일 시작");
	}
}
