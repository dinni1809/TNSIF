package ExceptionHAndling;

public class NestedCatch {
	public static void check() {
		String str="dinakar";
		int s= str.length();
		System.out.println("length"+s);
		String str2= null;
		int y=10;
		try {
			try {
				System.out.println(str.charAt(y));
			}catch(Exception ex) {
				System.out.println(ex);
			}System.out.println("string leng:"+str2.length());
		}catch(NullPointerException d) {
			System.out.println(d);
		}
	}public static void main(String[] args) {
		NestedCatch.check();
	}


		

}

