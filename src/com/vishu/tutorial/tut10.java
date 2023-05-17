package com.vishu.tutorial;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class tut10 {
    public static void main(String[] args) throws IOException{
       /* Scanner a =new Scanner(System.in);
        System.out.println("enter the number n1 :");
         int i= a.nextInt() ;
        System.out.println(++i);*/
//    //int x=10;
//      int y=20;
//      int z=x+y;
//        System.out.println(z);
//      //  float a= 4.50f;
//        int b= 6;
//        float c= a+b;
//        System.out.println(c);
//      //  int a='A'+5;
//        int b='B'+5;
//        int c=a+b;
//        System.out.println(c);
//      //  long a= 6512345;
//        double b= 56123.4244f;
//        double c=a-b;
//        System.out.println(c);
        // INCREMENT AND DECREMENT
//        int i=50;
//        //System.out.println(++i);
//        System.out.println(--i);
  /*      int y=7;
        int x=++y*8;
        System.out.println(x);*/
        inputExampleWithBufferedReader();
    }

    public static void inputExampleWithBufferedReader () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array : ");
        String[] input = br.readLine().split(" ");
        int[] arr = new int[input.length];
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
            System.out.print("Number " + i + " - " + arr[i] + ", ");
        }

        br.close();
    }
}
