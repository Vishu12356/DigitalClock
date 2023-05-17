package com.Saroha;
class A{
     public int a;
    public void vishu() {
        System.out.println("the valiue is "+a);
    }
    public void meth2(){
        System.out.println("i am method 2 overriding of class A");
    }
    public void meth3(){
        System.out.println("i am method 3 overriding of class A ");
    }
}
class B extends A{
    @Override //it is uses to show overriding ...when same method name used in another class called override.
    public void meth2() {
        System.out.println("i am method 2 overriding of class B");
    }
        public void meth3() {
            System.out.println("i am method 3 overriding of class B");
        }
    }
public class tut48_method_overriding {
    public static void main(String[] args) {
        A a1=new A();
        a1.meth2();
        B b=new B();
        b.meth2();
        /*b.a=6;
        b.vishu();*/
        /*B b1=new B();
        b1.meth3();*/

    }
}
