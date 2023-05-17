package com.vishu.tutorial;
import java.util.Scanner;
public class tut4 {
    public static void main(String[] args) {
        System.out.println("taking input from the user:");
        Scanner s=new Scanner(System.in);
        System.out.println("enter the n1:");
//        int a=s.nextInt();
//       // float a=s.nextFloat();
        short a=s.nextShort();
       System.out.println("enter the n2:");
       short b=s.nextShort();
//        int b=s.nextInt();
//        //float sum=a+b;
        short sum = (short)( a+b);
      System.out.println("the sum of these numbers:");
        System.out.println(sum);
// this method is used for print the line given by the user
        String str=s.nextLine();
        System.out.println(str);
        //if we print the single word them use the only 'next'
        //String str=s.next();
        //System.out.println(str);
    }
}
