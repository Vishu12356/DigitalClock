package com.vishu.tutorial;
      import java.util.Scanner;
public class tut24 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter your number here:");
      int n= sc.nextInt();

 //BREAK AND CONTINUE USING LOOPS!
  for (int i=1;i<10;i++) {
      //System.out.println(i);// for break statement
      if(i==5){
         break;
          //continue;
      }
     System.out.print(i+",");//for continue statement
  }
// USING WHILE LOOP in break statement
/*int i=1;
while(i<5){
    System.out.println(i);
    i++;
    if (i==3){
        break;
    }
  }*/
        // DO WHILE LOOP USED IN BREAK AND CONTINUE STATEMENT
//        int i=1;
//        do{
//            System.out.println(i);
//            if(i==3){
//               // break;
//                continue;
//            }
//            i++;
//        }while(i>10);
        // factorial program
      /*  int n=5;
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("the factorial of these no is: "+fact);*/
       /* int i=1;
        int fact=i;
        while(i<=5){
            fact=fact*i;
            i++;
        }
        System.out.println("the factorial of these no is :"+ fact);*/
       /* int i=1;
        int fact=1;
        do{
            fact=fact*i;
            i++;
        }while(i<=5);
        System.out.println("the factorial of these no is :" +fact);*/
/*int n=3;
int sum=0;
for(int i=1;i<=n;i++){
    sum =sum+(2*i)+1;
}
        System.out.println("the sum of these numbers is:"+ sum);*/
    }
}
