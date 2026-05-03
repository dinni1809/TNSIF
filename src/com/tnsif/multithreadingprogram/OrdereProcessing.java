
package com.tnsif.multithreadingprogram;
public class OrdereProcessing implements Runnable{

String Ordername ;

OrdereProcessing(String Ordername){
this.Ordername=Ordername;
}
@Override
public void run() {
System.out.println(Thread.currentThread().getName()+"Started processing "+Ordername);

try {
Thread.sleep(1000);// simulate processing time
}
catch(Exception e) {}
System.out.println(Thread.currentThread().getName()+"Completed"+Ordername);
}
public static void main(String[] args) {
	OrdereProcessing r1=new OrdereProcessing("order 1");
	OrdereProcessing r2=new OrdereProcessing("order 2");
	OrdereProcessing r3=new OrdereProcessing("order 3");

	Thread t1=new Thread(r1,"worker 1");
	Thread t2=new Thread(r2,"worker 2");
	Thread t3=new Thread(r3,"worker 3");

	t1.start();
	t2.start();
	t3.start();

}}
