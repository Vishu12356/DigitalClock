package com.vishu.tutorial;


public class tut27 {
    public static void main(String[] args) {
     //int [] marks={78,89,79,83,95};
     //float [] marks={79.5f,67.7f,98.2f,73.5f,94.9f}
     /*int arr[]={56,34,23,67,78};//also written as int arr[] as well as
        System.out.println(arr[3]);*/
       /* String[] student={"manish","ankit","krishna","shivom","varun"};
        System.out.println(student.length);
         System.out.println(student[4]);*/
       // System.out.println(marks[3]);
        //System.out.println(marks.length);// use for find the length of array


        // ............(DISPLAY THE ARRAY FOR THE HELP OF FOR LOOP)
        //....1.DISPLAY THE ARRAY
       int arr[]={67,78,89,90,98,87,76};
       for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+",");
        }
        //  ....2 .IN REVERSE ORDER
        /*int arr[]={67,78,89,90,98,87,76};
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+", ");
        }*/
        // ..3...FOR EACH LOOP
        /*for(int element:arr){
            System.out.print(element+",");
        }*/
      }
}
