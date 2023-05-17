package com.vishu.tutorial;
import java.util.Locale;
import java.util.Scanner;
public class tut16 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
         int n2= sc.nextInt();
       String n1="Vishu Saroha";
        System.out.println(n1.toUpperCase());
        System.out.println(n1.toLowerCase());
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));
        String txt1 = "Hello Everybody";
        System.out.println(txt.indexOf("e"));



       //  PROGRAM NO-1
        /*if(i>=18){
            System.out.println("you can drive:");
        }
        else{
            System.out.println("you can not drive:");
        }*/
        // PROGRAM NO -2
//        if (age>60){
//            System.out.println("you are experienced men:");
//        }
//        else if(age>50){
//            System.out.println("you are semi_experienced men:");
//        }
//        else if(age>30 & age<50){
//            System.out.println("you are semi_semi_experienced men");
//        }
//       else if(age>20 & age<30){
//            System.out.println("you are fresher:");
//        }
//       else{
//            System.out.println("you are children");
//        }
        //PROGRAM NO-3
//        switch (age){
//            case 1:
//                if(age<=90 & age>=99) {
//
//                    System.out.println("you are genius and experienced");
//                    break;
//                }
//            case 2:
//                if(age <60 & age >=89) {
//                System.out.println("you are genius but not experienced");
//                break;
//            }
//            case 3:
//                 if(age<35 & age>=59) {
//                System.out.println("you are not genius and not experienced");
//                break;
//            }
//            default:
//                System.out.println("enjoy your life");

/*if(i%2==0){
    System.out.println("your number is even");
   }
else{
    System.out.println("your number is odd");
}*/

    }
}
