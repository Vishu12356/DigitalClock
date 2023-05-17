package com.Saroha;
class rectangle{
    public int height;
    public int length;

    public rectangle(int h,int l) {
        this.height=h;
        this.length=l;
    }
    public double area(){
        return  this.height*this .length;
    }
}
class cuboid extends rectangle{
    public int width;

    public cuboid(int l, int h, int w) {
        super(h,l);
    }
    public double area(){
        return  2* (this.length * this.width + this.length * this.height + this.height * this.width);
    }
    public double volume(){

        return this.length*this.width*this.height;
    }
}
class circle{
    public int radius;
    circle(){
        System.out.println("i am constructor");
    }
    circle(int a){
        System.out.println("i am circle parameter constructor:");
        this.radius=a;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder extends circle{
    public int height;
    cylinder(int a,int h){
        super(a);
        System.out.println("i am cylinder parameter constructor:");
        this.height=h;
    }
    public double volume(){

        return Math.PI*this.radius*this.radius*height;
    }
}
public class tut52_problems {
    public static void main(String[] args) {
        rectangle r=new rectangle(6,8);
        r.area();
        System.out.println(r.area());
        cuboid c=new cuboid(6,4,2);
        c.volume();
        System.out.println(c.volume());
        //PROBLEM ..1
       /* circle c=new circle(5);
        c.area();
        System.out.println(c.area());*/
     /*  cylinder cy=new cylinder(5,8);
       cy.volume();
        System.out.println(cy.volume());*/
    }
}
