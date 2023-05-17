package com.vishu.tutorial;
import java.util.*;
public class tut26 {
   /*  example 1 classification
   public static void swap(int []marks,int i,int j){
        int temp=marks[i];
        marks[i]=marks[j];
        marks[j]=temp;
    }*/
    public static void main(String[] args) throws Exception {
        // example--2
        // example--3
        //example --4
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number here :");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("enter the values:");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter second number here:");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("enter second values:");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        int sub[]=new int[n2];
        int c=0;
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=sub.length-1;
        while(k>=0){
            int d=0;
            int val=i>=0?arr1[i]:0;

            if(arr2[j]+c>=val){
                d=arr2[j]+c-val;
                c=0;
            }else{
                d=arr2[j]+c+10-val;
                c=-1;
            }
            sub[k]=d;
            i--;
            j--;
            k--;
        }
        int idx=0;
        while(idx<sub.length){
            if (sub[idx]==0){
                idx++;
            }else{
                break;
            }
        }
        while(idx<sub.length){
            System.out.println(sub[idx]);
            idx++;
        }


        /*example --4
        int sum[]=new int[n1>n2? n1:n2];
        int c=0;
        int i=arr1.length-1;
        int j= arr2.length-1;
        int k=sum.length-1;
        while(k>=0) {
            int d = c;
            if (i >= 0) {
                d += arr1[i];
            }
            if (j >= 0) {
                d += arr2[j];
            }
            c = d / 10;
            d = d % 10;
            sum[k] = d;
            i--;
            j--;
            k--;
        }
            if(c!=0){
                System.out.println(c);
            }
            for(int val:sum) {
                System.out.println(val);
            }*/

       /*example --3 some code
        System.out.println("enter the value here whom you find the index");
        int n1=sc.nextInt();
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n1){
                idx=i;
                break;
            }
        }
        System.out.println("index is "+idx);*/

       // n1=arr[n];
        //display(n1,arr[i]);


     /* example --2 span of array
      some code
      int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]< min){
                min=arr[i];
            }
        }
int span=max-min;
        System.out.println(span);*/

      /* example --1
       int [] marks=new int[5];
        marks[0]=70;
        marks[1]=85;
        marks[2]=100;
        marks[3]=60;
        marks[4]=80;
        swap(marks,0,3);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }*/
      /*   Array programs
         //classroom of 5 students-you have store marks of these student
            1-ST.... type to create an array
         int [] marks=new int[5];*/
      /* second type
       int [] two=marks;
        two[2]=200;
        for(int i=0;i<two.length;i++){
            System.out.println(two[i]);
        }*/
        /*marks[5]=86;// show error in program because number
        of elements is 5 in array*/
    // 3rd type.....
        //int [] marks={86,78,98,76,88};
        // int marks[]={78,89,87,76,93}
        /*System.out.println(marks.length);
        System.out.println(marks[4]);*/

    }
}
