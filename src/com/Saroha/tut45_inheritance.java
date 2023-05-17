package com.Saroha;
class Base {
     int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
   /* public  void printdetail(){
        System.out.println("i am a constructor");
    }*/
}
    class Derived extends Base{
       public int y;
        public int getY() {
            return y;
        }
        public void setY(int y) {
            this.y = y;
        }
}
public class tut45_inheritance {
    public static void  main(String[] args) {
        //CREATE AN OBJECT AN BASE CLASS:
 /*       Base b=new Base();
        b.setX(10);
        System.out.println(b.getX());*/
       // b.printdetail();
        //CREATE AN OBJECT OF DERIVED CLASS:
        Derived d=new Derived();
        d.setY(20);
        System.out.println(d.getY());


    }
}