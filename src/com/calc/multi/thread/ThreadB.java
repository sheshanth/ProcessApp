package com.calc.multi.thread;

import java.util.Random;

class ThreadB extends Thread{
    int total;
    @SuppressWarnings("deprecation")
	@Override
    public void run(){
    	Random rand = new Random();
    	int n = (int)rand.nextInt(100) +3;
            for(int i=0; i<=n ; i++){
                total += i;
            }
            System.out.println("waiting");
            suspend();
            System.out.println(total);
    }
}