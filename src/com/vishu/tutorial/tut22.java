package com.vishu.tutorial;
 import java.util.Scanner;
public class tut22 {
    public static void main(String[] args) {
       // int n,fact =1;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number here:");
       float n= sc.nextFloat();
//        if(i%2==0){
//            System.out.println("your number is even");
//        }
//        else{
//            System.out.println("your number is odd");
//        }

//        for(int i=1;i<=n;i++)
//        {
//            fact = fact*i;
//        }
//        System.out.println("factorial of "+n+" is "+fact);
        // 2n=even number=0,12,4,6,8
        //2n+1=odd number=1,3,5,7,9
        //// 1...find the odd number
        for(int i=0;i<n;i++){
            System.out.print(2*i+1+",");

      }
        System.out.print("\nthank you!");
//        for(int i=n;i!=0;i--){
//            System.out.print(i+",");
//        }
    }
}
