package com.Saroha;

public class tutorial {
    /*static int logic(int x,int y) {
        int z;
    if (x>y){
        z=x+y;
    }
    else{
        z=(x+y)*10;
    }
    return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c;
        c=logic(a,b);
        System.out.println(c);
        int a1 = 10;
        int b1 = 20;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c1);*/
    //METHOD OVERLOADING
    static void Zoo(){
        System.out.println("Good morning bro!");
    }
    static void Zoo(int a,int b){
        System.out.println("Good morning "+ a + " bro!");
        System.out.println("Good morning "+ b + " bro!");
    }

    public static void main(String[] args) {
        //int a=200;
        //int b=400;
        Zoo();
        Zoo(300,400);
    }
}

