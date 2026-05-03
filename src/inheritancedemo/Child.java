package inheritancedemo;

public class Child extends Father{
	String passion="Badmintion";
	void read()
	{
		System.out.println("Java");
		
	}
	public static void main(String[] args) {
		Child c = new Child();
	   System.out.println(c.money);
	   System.out.println(c.car);
       c.occ();
       System.out.println(c.passion);
       c.read();
	}
}
