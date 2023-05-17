package com.Saroha;
class Employee {
   int Salery;
   // int salery;
    String name;
    public int getSalery() {
        return Salery;
    }
    public void setSalery(int salery) {
       this.Salery = salery;
    }
    public void getName() {
         //return name;
        System.out.println(name);
    }
    public void setName(String name) {
        this.name = name;
    }
}
    /*class cellphone {
        public void ringing() {
            System.out.println("ringing.....");
        }
        public void vibrating() {

            System.out.println("vibrating mode...");
        }
        public void callfriend() {
            System.out.println("call vaishu saroha...");
        }
    }*/
     /* class square {
          int side;
          public int area() {
              return side * side;
          }
          public int parimeter() {
              return 4 * side;
          }
      }*/
          class Area {
              int side;

              public int area() {
                  return side * side;
              }

              public int perimeter() {
                  return 2 * (side + side);
              }
          }
/*class square1{
    public int height,width,length;
   // int side;

    public int volume() {
        return length*width*height;
    }

}*/
public class tut38 {
    public static void main(String[] args) {
    //EXAMPLE NO 1...
        Employee E1 =new Employee();
        E1.name="manish";
        E1.getName();
       //E1.setName("vishu saroha");
        E1.setSalery(5000);
        System.out.println(E1.getSalery());
        //  System.out.println(E1 .getName());
        //EXAMPLE NO 2...
        /*cellphone samsung=new cellphone();
        samsung.callfriend();
        samsung.vibrating();
        samsung.ringing(); */
        //EXAMPLE NO 3..
    /*    square sc = new square();
        sc.side=5;
        System.out.println("the area of the square: "+sc.area());
        System.out.println("And the perimeter is: "+sc.parimeter());*/
        Area A=new Area();
        A.side=5;
        System.out.println("the area of the square: "+A.area());
        System.out.println("And the perimeter is: "+A.perimeter());
/*        square1 s1=new square1();
        s1.length=10;
        s1.width=5;
        s1.height=3;
        System.out.println("volume of the square is: "+s1.volume());*/
    }
}
