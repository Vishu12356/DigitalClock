package com.Saroha;
interface Sample1{
    void method1();
    void method2();
}
interface Sample2 extends Sample1{
    void method3();
    void method4();
}
class Practice implements Sample2,Sample1{
    public void method1(){
        System.out.println("method4");
    }
    public void method2(){
        System.out.println("method4");
    }
    public void method3(){
        System.out.println("method4");
    }
    public void method4(){
        System.out.println("method4");
    }
}

public class tut58_interface {
    public static void main(String[] args) {
  Practice pc=new Practice();
  pc.method3();
    }
}
