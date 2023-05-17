package com.Saroha;
interface mobile{
    void snapshot();
}
interface wifi{
    String[] getnetworks();
    void connect();
}
class Myphone{
    void callnumber(int contactnumber){
        System.out.println("calling.."+ contactnumber);
    }
void receivecall(){
        System.out.println("receiving...");
    }
}
class MyCellPhone extends Myphone implements wifi,mobile{
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
public class tut_57_interface {
    public static void main(String[] args) {
     MyCellPhone mcp=new MyCellPhone();
     mcp.connect();
     mcp.callnumber(9760250);
      String[]x =mcp.getnetworks();
        for (String item:x) {
            System.out.println(item);
        }
        System.out.println();
    }
}
