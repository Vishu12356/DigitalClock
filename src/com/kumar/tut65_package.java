package com.kumar;
//import java.util.*;
//* is used for access the all functionality
public class tut65_package {
    public static void main(String[] args) {
        // we can also use this method into single line
        java.util.Scanner sc=new java.util.Scanner(System.in);
        //Scanner sc=new Scanner(System.in);
        System.out.println("enter your first number:");
        int n1=sc.nextInt();
        System.out.println("enter your second number:");
        int n2=sc.nextInt();
        int sum=n1+n2;
        System.out.println("the sum of these number is "+ sum);
    }
}
