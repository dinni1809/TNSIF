package ExceptionHAndling;

public class Arrayindex {
public static void main(String[] args) {
	int[] arr= new int [5];
	System.out.println(arr[2]);
	try {
		System.out.println(arr[10]);
	}
	catch (Exception h)
	{
		System.out.println(h);
		
	}
	System.out.println(" Excpetion caught");

	}
}
