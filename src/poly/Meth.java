package poly;

class Demo {
	void display()
	{
		System.out.println("increment 10%");
	}

}
class Test extends Demo {
	@Override
	void display() {
		System.out.println("Increment 15%");
		super.display();

	}
	}
public class Meth
{
	public static void main(String[] args) {
   Demo m = new Demo();
		   m.display();
		   }
}
