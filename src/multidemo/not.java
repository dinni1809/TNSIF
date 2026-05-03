package multidemo;

public class not extends notification{
	String msg= " Push notifications";

void dis() {
	System.out.println("child"+msg);
	System.out.println("parent"+super.msg);	
}
public static void main(String[] args) {
	not n=new not();
	n.dis();
}
}
