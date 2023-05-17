package com.vishu.tutorial;

import java.util.Arrays;
class s{
    static int logic( int x, int y){
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }
}

public class tut31 {

    public static void main(String[] args) {
        s t=new s();
        int a=10;
        int b=20;
        int c;
        c=t.logic(a,b);
        System.out.println(c);
        //System.out.println();


       /* int arr[]={10,20,30,40,50};
        for(int i=0;i<arr.length;i++) {
            System.out.println("index of these element : " + i + " : " + arr[i]);
        }*/
/*int arr[]={2,4,6,8,9,12,34,56};
        for (int i=0,j=arr.length-1; i<j; i++, j--) {
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/
    }
}
