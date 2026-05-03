package poly;

 class Load {
	Load(int a, String b) {
		System.out.println("2 diff parameters");
	}
	Load(double b,String d, String c){
		System.out.println("3 parameters");
	}
	Load(String e, String f) {
		System.out.println("2 same parameters");
	}
 }
public class Conload {
	public static void main(String[] args) {
		Load cat= new Load(1,"a");
		Load d=new Load(10.2,"b","c");
		Load e=new Load("a","c");
        
		
	}
}
 
