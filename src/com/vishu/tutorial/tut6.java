package com.vishu.tutorial;
import java.util.*;
public class tut6 {
    public static void display(int n , int r,int npr){
        System.out.println(n+"p"+ r+" ="+npr);
    }
    public static int fact(int x) {
        int a = 1;
        for (int i = 1; i <= x; i++) {
            a = a * i;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number here what you want to be calculate :");
        int n=sc.nextInt();
        System.out.println("enter second number here what you want to be calculate :");
        int r=sc.nextInt();

        int nfact =fact(n);
        int rfact=fact(n-r);
     int npr=nfact/rfact;
        display(n,r,npr);



       /* String[] cars={"volvo","ford","tata","suzuki","honda"};
       // for(int i=0;i<cars.length;i++){
           // System.out.println(cars[i]);
            System.out.println(cars.length);*/
        }
      /*  int i=0;
        while(i<10){
            System.out.println(i);
            i++;
            if(i==4){
                break;
            }
        }*/
        /*for(int i=0;i<10;i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);*/
       /* int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }*/
       /* System.out.println(Math.sqrt(25));
        System.out.println(Math.max(92,342));
        System.out.println(Math.min(2,1));*/
//        System.out.println("what is your name:");
//        Scanner sc = new Scanner(System.in);
//        String name=sc.nextLine();
//        System.out.println("Hello " + name + " have a good day!");
      /*  System.out.println("enter the value of kilometer:");
        Scanner sc = new Scanner(System.in);
        float km=sc.nextInt();
        float miles= (float) (km/1.609);
        System.out.println("the value in miles is " + miles + " miles ");*/
    }

