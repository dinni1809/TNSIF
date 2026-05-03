package abstraction;
interface sm{
	void turnOn();
	void turnOff();
	void getStatus();
}
class sl implements sm{

	@Override
	public void turnOn() {
System.out.println(" sl on ");		
	}

	@Override
	public void turnOff() {
System.out.println("sl off");		
	}

	@Override
	public void getStatus() {
System.out.println("sl is steady");		
	}
	
}
public class Inter {
	public static void main(String[] args) {
		sl s = new sl();
		s.turnOn();
		s.turnOff();
		s.getStatus();
	}

}
