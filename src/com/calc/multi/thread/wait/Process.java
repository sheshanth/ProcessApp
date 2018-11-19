package com.calc.multi.thread.wait;

import java.util.Random;
import java.util.Scanner;

public class Process {
	
	public void A() throws InterruptedException {
		synchronized (this) {
			System.out.println("Started " +hashCode());
			Random rand = new Random();
			int n = (int )rand.nextInt(5000)+1000;
			int total = 0;
			for(int i=0;i<n;i++)
				total+= i;
			wait();
			Thread.sleep(5000);
			//System.out.println("Resumed");
			System.out.println(hashCode()+ " total is " +total);
		}		
	}
	
	@SuppressWarnings("resource")
	public void B() throws InterruptedException{
		Scanner scanner = new Scanner(System.in);
		Thread.sleep(2000);
		synchronized (this) {
			System.out.println("waiting for Return key " +hashCode());
			scanner.nextLine();
			System.out.println("Return key pressed " +hashCode());
			notify();
		}
	}
	
}
