package com.vishu.tutorial;
import java.util.Scanner;
public class tut8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n1=sc.nextInt();
        System.out.println("enter the elements "+" ");
         int arr[]=new int[n1];
         for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
         }
         //reverse array program.
         int i=0;
         int j=arr.length-1;
         while (i < j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(i=0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
   /* public static void factr(int n1,int n2,int npr){
        System.out.println(n1+"p"+n2+" ="+ npr);
    }
    int factorial;
   public static int fact(int x) {
       int factorial = 1;
       for (int i = 1; i <= x; i++) {
           factorial = factorial * i;
       }
           return factorial;
   }
    //this program is used for operators:
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number here what you want to be calculate :");
        int n1=sc.nextInt();
        System.out.println("enter second number here what you want to be calculate :");
        int n2= sc.nextInt();
        int fact=fact(n1);

        int rfact=fact(n1-n2);
        int npr=fact/rfact;
        factr(n1,n2,npr);*/


//        float a= (float) 12.84; //
//        float b= (float) (7.16f+a);
        //System.out.println();
//       int a=31;// [1]....arthmetic operator
//         int b= 9;
//         int a=31;
        /*float a= (float) 25.899;
        float b= (float) 12.34;
        float v = a % b;
        System.out.println(v);*/
//         int sum = a + b;
//         System.out.println(sum);


//        int b= 9*a;  // [2]... assignment operators
//        int a=10;
//        //a*=3;
//        a+=5;
//        System.out.println(a);


//        int a=31;
//        int b= 9;
//        int sum = a + b;
//        System.out.println(sum);
        //System.out.println(15==20);// [3]...comparison operator:
        // System.out.println(10>=10);
        //System.out.println(2<5 && 2<4);//[4]....logical operators
       // System.out.println(2<5||2>4);
        //IN CASE OF 'OR' IF  both value is false then return is false
        // IN CASE OOF 'AND' BOTH VALUE IS TRUE then return is true othrwise return false

    }

