package com.Saroha;
class Employee1 {
    int id;
    String name;

    public void Printdetail() {
        System.out.println("the id is " + id);
        System.out.println("And the name is " + name);
    }
}
        public class tut36_oops {
            public static void main(String[] args) {
                System.out.println("this is our custom class:");
                Employee1 E1 = new Employee1();
                E1.id = 10;
                E1.name = "Vishnu";
               /* System.out.println(E1.id);
                System.out.println(E1.name);*/
                E1.Printdetail();
            }
        }
