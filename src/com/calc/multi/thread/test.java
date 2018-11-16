package com.calc.multi.thread;

public class test extends Thread{
	
	public void run() {
		j();
		//System.out.println("Workld");
		notifyAll();
		System.out.println("hi");
	}

	public synchronized void j() {
		System.out.println("hello " + hashCode());
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
	
	public static void main(String[] args) {
		test t1 = new test();
		test t2 = new test();
		/*test t3 = new test();
		test t4 = new test();
		test t5 = new test();*/
		t1.start();
		t2.start();
		/*t3.start();
		t4.start();
		t5.start();*/
	}

}
