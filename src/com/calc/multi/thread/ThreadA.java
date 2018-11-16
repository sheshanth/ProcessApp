package com.calc.multi.thread;

public class ThreadA {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException{
        ThreadB b = new ThreadB();
        ThreadB b2 = new ThreadB();
        ThreadB b3 = new ThreadB();
        ThreadB b4 = new ThreadB();
        ThreadB b5 = new ThreadB();
        b.start();
        System.out.println("b is waiting");
        //b.suspend();
 
        /*synchronized(b){
            try{
                System.out.println("Waiting for b to complete...");
                b.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
            System.out.println("Total is: " + b.total);
        }*/
        
        b2.start();
        System.out.println("b2 is waiting");
        //b2.suspend();
        
        /*synchronized(b2){
            try{
                System.out.println("Waiting for b2 to complete...");
                b2.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        	
            System.out.println("Total is: " + b2.total);
        }*/
        
        b3.start();      
        System.out.println("b3 is waiting");
       // b3.suspend();
        
        /*synchronized(b3){
            try{
                System.out.println("Waiting for b3 to complete...");
                b3.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        	
            System.out.println("Total is: " + b3.total);
        }*/
        
        b4.start();
        System.out.println("b4 is waiting");
        //b4.suspend();
        
        /*synchronized(b4){
            try{
                System.out.println("Waiting for b4 to complete...");
                b4.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        
            System.out.println("Total is: " + b4.total);
        }*/
        
        b5.start();
        System.out.println("b5 is waiting");
        //b5.suspend();
        
       /* synchronized(b5){
            try{
                System.out.println("Waiting for b2 to complete...");
                b5.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("Total is: " + b5.total);
        }*/
        b.resume();
        b2.resume();
        b3.resume();
        b4.resume();
        b5.resume();
        /*System.out.println(b.total);
        System.out.println(b2.total);
        System.out.println(b3.total);
        System.out.println(b4.total);
        System.out.println(b5.total);*/
    }
}
 
