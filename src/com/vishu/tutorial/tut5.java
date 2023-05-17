//PRACTICE SET OF JAVA
//EXAMPLE NO=1
//package com.vishu.tutorial;
//import java.util.Scanner;
//public class tut5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        float total =500;
//        System.out.println("Hindi:");
//        float a=sc.nextFloat();
//        System.out.println("English:");
//        float b=sc.nextFloat();
//        System.out.println("mathematics:");
//        float c=sc.nextFloat();
//        System.out.println("Science:");
//        float d=sc.nextFloat();
//        System.out.println("Social Science:");
//        float e=sc.nextFloat();
//        float sum=a+b+c+d+e;
//        System.out.println("your total number is:");
//        System.out.println(sum);
//        float percentage=(sum/total)*100;
//        System.out.println("MARKS PERCENTAGE IS:");
//        System.out.println(percentage);
//    }
//
//}
//EXAMPLE NO=2
//package com.vishu.tutorial;
//import java.util.Scanner;
//public class tut5 {
//    public static void main(String[] args) {
//        float a1= (float) 45.89;
//        float a2= (float) 56.45;
//        float a3= (float) 56.6;
//         float Sum=a1+a2+a3;
//        System.out.println("the sum of thesw numbers is:");
//        System.out.println(Sum);
//EXAMPLE NO 2.1(Taking input from the user)
package com.vishu.tutorial;
import java.util.Scanner;
public class tut5 {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int arr[]=new int[n1];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int span=max-min;
        System.out.println(span);
//        System.out.println("Enter your first number:");
//        float n1= sc.nextFloat();
//        System.out.println("Enter your second number:");
//        float n2= sc.nextFloat();
//        System.out.println("enter your third number:");
//        float n3= sc.nextFloat();
//        float sum=n1+n2+n3;
//        System.out.println("the sum of these number is:");
//        System.out.println(sum);
//        System.out.println("thank you!");
        //EXAMPLE NO 3...FIND THE CGPA OF THREE NUMBERS
       /* float subject1=67;
        float subject2=57;
        float subject3=63;
        float cgpa=(subject1+subject2+subject3)/30;
        System.out.println(cgpa);*/
    }
}

