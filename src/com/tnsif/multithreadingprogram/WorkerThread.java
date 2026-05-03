package com.tnsif.multithreadingprogram;


public class WorkerThread extends Thread{
	public void run() {
		for (int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			}
			catch (Exception e) {}
			} 
		}
	public static void main(String[] args) {
		WorkerThread w1= new WorkerThread();
		WorkerThread w2= new WorkerThread();
		w1.setName("Thread A");
		w2.setName("THread  B");
		w1.start();
		w2.start();
		
	}
	}


