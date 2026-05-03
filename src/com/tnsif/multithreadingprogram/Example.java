package com.tnsif.multithreadingprogram;

public class Example {

 public static void main(String[] args) {
T t1 = new T("Thread-1");
T t2 = new T("Thread-2");
t1.start();
t2.start();
}
}