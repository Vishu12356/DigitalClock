package com.Saroha;
interface wifi2{
    String[] getnetworks();
    void connect();
}
class Myphone2{
    void callnumber(int contactnumber){
        System.out.println("calling.."+ contactnumber);
    }
    void receivecall(){
        System.out.println("receiving...");
    }
}
class MyCellPhone2 extends Myphone2 implements wifi2{
    public void snapshot(){
        System.out.println("Taking the snapshots..");
    }
    public String[] getnetworks() {
        System.out.println("getting network list:");
        String[] x={"Airtel","Vodafone","Jio"};
        return x;
    }
    public void connect(){
        System.out.println("connect the phone :");
    }
}
public class tut59_polymorphism {
    public static void main(String[] args) {
   wifi2 wf= new MyCellPhone2();
   wf.connect();
    }
}
