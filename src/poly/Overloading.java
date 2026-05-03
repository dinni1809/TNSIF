package poly;

public class Overloading {
	int mul(int a , int b) {
		return a*b;
	}
	double mul(double a , double b) {
		return a *b;
		
	}
	int mul(int a , int b , int c) {
		return a * b * c;
	}
	
	public static void main(String[] args) {
		Overloading o= new Overloading();
		System.out.println(o.mul(6, 5));
		System.out.println(o.mul(8.9, 5.7));
		System.out.println(o.mul(2, 3,19));

	}
	 

}
