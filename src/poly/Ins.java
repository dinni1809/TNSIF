package poly;

class Com
{
}
class CCom extends Com 
{
}
class CCCom extends CCom
{}
public class Ins{
	public static void main(String[] args) {
		Com c = new Com();
		CCom d= new CCom();
		CCCom e= new CCCom();	
	}
}

