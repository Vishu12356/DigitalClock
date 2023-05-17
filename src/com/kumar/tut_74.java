package com.kumar;
class thr2 extends Thread {
    public void run() {
        int i = 0;
        while (i <= 10) {
            System.out.println("i am thread: ");
            try {
                Thread.sleep(450);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
            //System.out.println("i am thread ");
            i++;
        }
    }
}
class thr3 extends Thread {
    @Override
    public void run() {
        int i=0;
        do {
            System.out.println("my Thread2 is chatting");
            i++;
        }while (i<25);
    }
}
public class tut_74 {
    public static void main(String[] args) {
     thr2 t2=new thr2();
     thr3 t3=new thr3();
     t2.start();
     t3.start();
     //join method
     //when we want to print entire method at once time so, we use join method
        /*try{
            t2.join();
        }
        catch (Exception e){
            System.out.println(e);
        }*/
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());

    }
}
