package com.Saroha;
import java.util.Scanner;
class circle1{
    public int radius;
    circle1(){
        System.out.println("i am constructor");
    }
    circle1(int a){
        System.out.println("i am circle parameter constructor:");
        this.radius=a;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
public class tut35 {
    //EXAMPLE NO --1
   /* static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d x %d = %d\n", n, i, n * i);
        }
    }*/
   /* static  int factorial(int n){
        if( n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.print("Enter the no here what you want table of:");
        System.out.println("put the radius here: ");
        int n = sc.nextInt();
        circle1 c=new circle1(6);
        c.area();
        System.out.println(c.area());
      //  System.out.println("enter the value what want to factorial "+ factorial(n));
       // table(n);
    }

    //EXAMPLE NO --2
    /*static void starpattern()
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        starpattern();
    }*/
    // EXAMPLE NO --3
  /*  static int natural(int n){
       if(n==1){
           return 1;
        }
       else{
         return n+natural(n-1);
       }
    }

    public static void main(String[] args) {
        int x=natural(5);
        System.out.println(x);

    }*/
    //EXAMPLE NO--4
   /* static void starpattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }*/
}