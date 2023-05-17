package com.vishu.tutorial;

public class tut28 {
    public static void main(String[] args) {
  // ...2-D Array
       // int [] marks;//1-D array
        int arr[][];//2-D array
        arr=new int[2][3];
        // ROW AND COLUMN EXP....(2 ROW AND 3 COlUMN:)
        arr[0][0]=101;// 0 row 0 column
        arr[0][1]=102;//0 row 1 column
        arr[0][2]=103;//0 row 2 column
        arr[1][0]=201;//1 row 0 column
        arr[1][1]=202;//1 row 1 column
        arr[1][2]=203;//1 row 2 column
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
