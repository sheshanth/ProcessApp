package com.calc.multi.thread.wait;

public class App {
	public static void main(String[] args) throws InterruptedException {
		Process process1 = new Process();
		Process process2 = new Process();
		Process process3 = new Process();
		Process process4 = new Process();
		Process process5 = new Process();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					process1.A();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					process2.A();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					process3.A();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t4 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					process4.A();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t5 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					process5.A();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t6 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					process1.B();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t7 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					process2.B();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t8 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					process3.B();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t9 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					process4.B();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t10 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					process5.B();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		t6.start();
		t7.start(); t8.start(); t9.start(); t10.start();
		 
	}
}
