package com.Saroha;
class Base1{
    Base1(){
        System.out.println("i am a constructor:");
    }
    Base1(int x){
        System.out.println("i am a constructor with value of x is : "+x);
      }
    }
class Derived1 extends Base1{
    Derived1(){
        super();
        System.out.println("i am a Derived class constructor:");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("i am a overloaded constructor of derived with value of y is : "+y);
    }
}
class child extends Derived1{
    child(){
        System.out.println("i am a child class constructor:");
    }
    child(int x ,int y,int z){
        super(x,y);
        System.out.println("i am a overload constructor with value of z:"+z);
     }
    }
public class tut45 {
    public static void main(String[] args) {
        /*//Base1 b=new Base1();
        Base1 b=new Base1(1);*/
        //Derived1 d=new Derived1();
       Derived1 d=new Derived1(7,5);
       // child c1=new child(3, 5,6);
    }
}