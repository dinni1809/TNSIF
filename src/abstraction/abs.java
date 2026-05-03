package abstraction;

abstract class ab1 {
	public void call() {
		System.out.println("Calling the student");
	}
public abstract void all();
public abstract void sat();
public abstract void health();
}

 class ab2 extends ab1 {
	@Override
	public void all() {
		System.out.println("Call all");
		
	}
	@Override
	public void sat() {
		System.out.println("Call trhough satellite phone");	
	}
	@Override
		public void health() {
	System.out.println("Call to healthy person");	
}	
}
public class abs{
	public static void main(String[] args) {
		ab2 a = new ab2();
		a.all();
		a.sat();
		a.health();
	}
}
