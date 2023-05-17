package com.Saroha;
abstract  class Pen{
    abstract void Write();
    abstract  void Refil();
    }
class fountainPen extends Pen{
    public  void Changenib(){
        System.out.println("this is method of Change the nib..");
    }
    public void Write(){
        System.out.println("this is write method implements pen class");
    }
    public void Refil(){
        System.out.println("this is Refil method implements pen class..");
    }
}
interface  BasicAnimal{
    void  Eat();
    void Sleep();
}
 class  Monkey {
     void Jump(){
        System.out.println("jumping...");
    }
    void Bite(){
        System.out.println("biting...");
    }
}
class Human extends  Monkey implements BasicAnimal {
    public  void  speak(){
        System.out.println("hello sir!");
    }
    public void  Eat(){
        System.out.println("eating the food:");
    }
    public void Sleep(){
        System.out.println("sleeping...");
    }
}
interface Tvremote{
    void control();
}
interface Smarttvremote extends Tvremote{
    void smartcontrol();
}
class TV implements Smarttvremote{
   public void control(){
       System.out.println("this is a method of control:");
    }
    public void smartcontrol(){
        System.out.println("this is a method of smartcontrol");
    }
}
abstract class TelePhone {
    abstract void Ring();
    abstract  void Lift();
    abstract  void Disconect();
}
class SmartTelePhone extends TelePhone{
    public void Ring(){
        System.out.println("this is a method od ring..");
    }
    public void Lift(){
        System.out.println("this is a method od lift..");
    }
    public  void Disconect(){
        System.out.println("this is a method od disconect..");
    }
}
public class tut_60_practice {
    public static void main(String[] args) {
    fountainPen fn=new fountainPen();
    fn.Refil();
     BasicAnimal ba= new Human();
     ba.Eat();
     TelePhone tp=new SmartTelePhone();
     tp.Disconect();
     Smarttvremote smtv=new TV();
     smtv.control();
    }
}
