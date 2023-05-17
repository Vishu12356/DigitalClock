package com.Saroha;
interface  Car{
    int a=10;
    void Break(int decrement);
    void Speed(int increment);
}
interface Bus{
    void blowhorn1();
    void blowhorn2();
}
class Vehicle implements Car,Bus {
    void horn(){
        System.out.println("blow horn");
    }
   public void Break(int decrement){
       System.out.println("applying break");
    }
     public void Speed(int increment){
        System.out.println("applying speeder");
    }
    public void blowhorn1(){
        System.out.println("applying horn loudly");
    }
    public void blowhorn2(){
        System.out.println("apply horn slowely");
    }
}
public class tut54 {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle();
        v1.Break(1);
       // v1.Break(10);you can not modify the properties of interfaces
        System.out.println(v1.a);
       v1.blowhorn1();
       v1.blowhorn2();
    }
}
