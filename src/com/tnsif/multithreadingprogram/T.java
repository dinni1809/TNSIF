package com.tnsif.multithreadingprogram;

public class T extends Thread {
String name;
public T(String name) {
this.name = name;
}
@Override
public void run() {
try {
for (int i = 1; i <= 5; i++) {
System.out.println(name + " running: " + i);
Thread.sleep(500);
}
} catch (InterruptedException e) {
System.out.println(name + " interrupted");
}
}
}