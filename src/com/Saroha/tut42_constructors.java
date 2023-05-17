package com.Saroha;
/*class physics{
    int marks;
    String subject;
    public physics(int mymarks,String mysubject){
        this.marks=mymarks;
        this.subject=mysubject;
    }
    public void getsubject() {
        //return name;
        System.out.println(subject);
    }
    public void setName(String name) {
        this.subject = name;
    }
}*/

class Cyclinder{
    private int radius;
    private int height;

    public Cyclinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
    public double Surfacearea(){
        return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }
}
public class tut42_constructors {
    public static void main(String[] args) {
       /* physics p=new physics(87,"gravity");
      p.getmysubject();*/
        Cyclinder Vishu=new Cyclinder(5,7);
        //PROBLEM--1
       /* Vishu.setHeight(4);
        System.out.println(Vishu.getHeight());
        Vishu.setRadius(15);
        System.out.println(Vishu.getRadius());*/
        //PROBLEM --2
       // System.out.println(Vishu.volume());
        //System.out.println(Vishu.Surfacearea());
        //PROBLEM--3
    /*    cyclinder Vishu=new Cyclinder(5,10);
        Vishu.getRadius();
        System.out.println("the radius of the given Cyclinder is:"+ Vishu.getRadius());
        System.out.println("the height of the given Cyclinder is:"+Vishu.getHeight());
        //System.out.println(Vishu.getRadius());
        //System.out.println(Vishu.getHeight());*/
    }

}

