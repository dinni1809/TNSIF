package ExceptionHAndling;

public class STringIndex {
public static void main(String[] args) {
	String a = "dinakar";
	try {
	System.out.println(a.charAt(30));
	}
	catch ( Exception g)
	{
		System.out.println(g);
		
	}
	System.out.println("exception caught");
}
}
