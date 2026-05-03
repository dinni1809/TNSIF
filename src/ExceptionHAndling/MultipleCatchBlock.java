package ExceptionHAndling;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class MultipleCatchBlock {
public static void main(String[] args) {
	int a[]=new int[5];
	try {
		int i= a[10];
	}
	catch ( ArithmeticException e) {
	System.out.println("helloooo");
	}
	catch ( StringIndexOutOfBoundsException f) {
	System.out.println("string");
}
	catch ( IndexOutOfBoundsException g ) {
		System.out.println("child");
	}
	catch ( Exception h) {
		System.out.println("parent");
	}
	
}
}
