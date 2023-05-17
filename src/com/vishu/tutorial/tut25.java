package com.vishu.tutorial;
import java.util.Scanner;
public class tut25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
      //PRACTICE PROBLEM 1
//      int n=4;
//      for (int i=n;i>0;i--) {
//          for (int j = 0; j<i; j++) {
//              System.out.print(" * ");
//          }
//          System.out.print("\n");
//      }
        //PRACTICE PROBLEM 2 //SUM OF N EVEN NUMBERS AND ODD NUMBERS
//        int sum=0;
//        int n=5;
//      for(int i=0;i<n;i++) {
//          //sum = sum + (2 * i); //ODD NUMBERS
//          sum =sum + (2*i+1);// EVEN NUMBERS
//      }
//          System.out.print("sum of these number is:");
//          System.out.println(sum);
      //PRACTICE  PROBLEM 3
//        int a=1;
//        //for(int i=1;i<=10;i++){
//        for(int i=10;i>=1;i--){
//            System.out.printf("%d * %d =%d\n",n,i,n*i);
//        }
     //PRACTICE PROBLEM 4
        //int a=1;
        int fact=1;
        for(int i=1;i<=n;i++) {
            fact = fact * i;
        }
        System.out.print("factorial of these number is:");
            System.out.print(fact);
    }
}
