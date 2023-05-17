package com.vishu.tutorial;
import java.util.*;
public class  tut3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enyter your number here:");
        int n=sc.nextInt();
        if(n%1==0){
            System.out.println("number is prime");
        } else if (n%n==0) {
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is composite");
        }

    }
   /* public static void main(String[] args) {
        int age = 35;
        System.out.println(age);
        byte a1 = 40;
        System.out.println(a1);
        short a2 = 56;
        System.out.println(a2);
        long a3 = 377878757;
        System.out.println(a3);
        float f1 =56.67f;
        System.out.println(f1);
        double d1= 4.66d;
        System.out.println(d1);
        char a4='A';
        boolean b=true;
        System.out.println(a4);
        System.out.println(b);
        String ptr="vishu saroha";
        System.out.println(ptr);*/

  /* public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();
       int a=0;
       int b=1;
       for(int i=1;i<=n;i++){
           System.out.print(" "+a);
           int c=a+b;
           a=b;
           b=c;
       }*/

    /*for(int i=0;i<=n;i++){
        System.out.println(i);
    }*/

     /*  String name=sc.nextLine();
       System.out.println("hello "+name);*//*
       int n=sc.nextInt();
       System.out.println("enter your number here: ");
       for(int i=1;i<=n;i++){
           System.out.print(i+" ");
       }*/
       //when a case for both string and integer are together then we write- ->
     /*  int n= Integer.parseInt(sc.nextLine());
       String name=sc.nextLine();
       System.out.println("hello "+name);
       for(int i=1;i<=n;i++){
           System.out.print(i+" ");
       }*/

   }
