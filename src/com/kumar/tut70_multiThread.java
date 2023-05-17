package com.kumar;
class MyThread1 extends Thread {
    //thread are used for achieve synchronization and cpu utilization
    //multithreading are used for achieve concurrency
    @Override
    public void run() {
        int i=0;
        while (i<50) {
            System.out.println("my Thread1 is cooking food");
            i++;
        }
    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        int i=0;
        do {
            System.out.println("my Thread2 is chatting");
            i++;
        }while (i<25);
    }
}
public class tut70_multiThread {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();

    }
}
