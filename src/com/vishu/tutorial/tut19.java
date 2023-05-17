package com.vishu.tutorial;
import java.util.Scanner;
public class tut19 {
    public static void main(String[] args) {
    //    EXAMPLE NO 1....
//        int a = 10;
//        if (a == 11)
//            System.out.println("i am ??");
//        else
//            System.out.println("i am not in ??");
     //QUESTION 2...
        Scanner sc=new Scanner(System.in) ;
        int n1,n2,n3;
        System.out.println("enter the physics marks:");
        n1=sc.nextInt();
        System.out.println("enter the chemistry marks :");
        n2=sc.nextInt();
        System.out.println("enter the maths marks:");
        n3=sc.nextInt();
        int avg=(n1+n2+n3)/3;
        System.out.println("total percentage is:" +avg);
        if(avg>=40 && n2>=33 && n3>=33){
            System.out.println("you are passed:");
        }
        else{
            System.out.println("sorry! you are fail");
        }


    }
}
