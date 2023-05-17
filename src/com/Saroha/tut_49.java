package com.Saroha;
class phone{
    public int x;
    public void on(){
        System.out.println("turning on phone...");
    }
    public void showtime(){
        System.out.println("time is 8 am:");
    }
}
class smartphone extends phone{
    public int x;
    public void music(){
        System.out.println("play the music:");
    }
    @Override
    public void on(){
        System.out.println("turning on smartphone...");
    }
 }
public class tut_49 {
    public static void main(String[] args) {
        phone obj=new smartphone();//here obj is reference of super class.we can taking reference of super class is equal to subclass object but not vice versa
        obj.showtime();
        obj.on();
       // obj.music();// not allowed only that method class which is common and present in super class
        // smartphone smobj=new phone();//not allowed because smartphone is subclass .and smobj is reference of subclass
  /*phone ph=new phone();
  ph.on();
  smartphone smph=new smartphone();
  smph.music();*/
      /*  phone ph =new phone();
      ph.showtime();
      ph.on();*/
    // ph.music();// not allowed because music is the reference of smartphone it is the method of subclass and object is super class
        smartphone ph1=new smartphone();
        ph1.music();
    }
}
