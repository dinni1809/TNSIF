package multidemo;

public class metho extends meth{
	public void process() {
		System.out.println("Processing via gpay");
		
	}
void display() {
	super.process();
	process();
	
	
}
public static void main(String[] args) {
	metho m= new metho();
	m.display();
	
}
}
