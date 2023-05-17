package com.Saroha;
import java.util.*;
import java.io.*;
class Main{
    static int no_hrs,salary;
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of hours : ");
        no_hrs=sc.nextInt();
        System.out.print("Enter the employee's salary : ");
        salary=sc.nextInt();
        getinfo(no_hrs,salary);
        AddSal();
        AddWork();
    }
    static void getinfo(int hrs,int salary)
    {
        System.out.println("Employee salary = "+salary);
        System.out.println("Employee working hours = "+hrs);
    }
    static void AddSal()
    {
        if(salary<5000)
        {
            salary=salary+100;
        }
        System.out.println("New employee salary = "+salary);
    }

    static void AddWork()
    {
        if(no_hrs>6)
        {
            salary=salary+150;

        }
        System.out.println("New employee salary working hours = "+salary);
    }
}


/*import com.vishu.tutorial.AccessModifier1;

public class AccessModifier3 extends AccessModifier1 {

    public static void main(String[] args) {
        AccessModifier3 acm = new AccessModifier3();
        acm.print();
        }
    }*/
