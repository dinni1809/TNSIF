package inheritancedemo;

public class Granddaughter extends Daughter{
 public void interest() {
	 System.out.println("Dance");
 }
 public static void main(String[] args) {
	
 Granddaughter d = new Granddaughter();
 System.out.println(d.money);
 System.out.println(d.asset);
 d.cook();
 System.out.println(d.House_name);
 System.out.println(d.status);
 d.interest();

 }
}
 
 
  
