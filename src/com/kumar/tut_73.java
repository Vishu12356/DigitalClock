package com.kumar;
//constructor in thread.
class thr extends Thread{
    public thr(String name){
        super(name);
        //System.out.println(name);
    }
    public void run(){
       System.out.println("i am thread: "+this.getName());
        //System.out.println("i am thread ");
    }
}
public class tut_73 {
    public static void main(String[] args) {
         thr t=new thr("vishu");
         thr t2=new thr("manish");
         thr t3=new thr("manish saroha");
         t.setPriority(Thread.MAX_PRIORITY);
         t2.setPriority(Thread.MIN_PRIORITY);//it is used for set priority
         t.start();
         t2.start();
         t3.start();

        /*System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t2.getId());
        System.out.println(t2.getName());
        System.out.println(t3.getId());
        System.out.println(t3.getName());*/
    }
}
