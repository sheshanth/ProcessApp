package com.calc.multi.thread;



public class Test2 {
/**
 * @param args
 */
public static void main(String[] args) {
    Runnable t1 = new Runnable() {
        public void run() {
            System.out.println(add(1, 2));
        }
    };

    Runnable t2 = new Runnable() {
        public void run() {
        	System.out.println(add(3, 4));

        }
    };


    new Thread(t1).start();
    new Thread(t2).start();

}


public static int add(int number, int num){
    // when different thread call method 
    // for example   
    //  Runnable t1 call ,then "number" will be assigned 1, "num" will be assigned 2
    //  number ,num will keep in thread'stack spack
    return number + num;
}

}