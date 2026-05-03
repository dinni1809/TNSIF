package abstraction;

interface play {
	 void music();
}
interface camera {
	void takep();
}
 class phone implements play , camera{

	@Override
	public void takep() {
System.out.println("Take pic");		
	}

	@Override
	public void music() {
System.out.println("listen to music");		
	}
 }
	public class multiple{
		public static void main(String[] args) {
			
		
		phone p = new phone();
		p.takep();
		p.music();
	}
	}

