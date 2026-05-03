package ExceptionHAndling;

public class without {
	public static void main(String[] args) {
		System.out.println(10/2);
		System.out.println(50/2);
		
		try { 
int a = 20/0;		}
		catch ( ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println(30/2);
	}
}

