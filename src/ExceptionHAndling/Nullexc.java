package ExceptionHAndling;

public class Nullexc {
	public static void main(String[] args) {
		String a=null ;
		try {
			System.out.println(a.length());
		}
		catch (Exception f) {
			System.out.println(f.getMessage());
		}
		
	}

}






