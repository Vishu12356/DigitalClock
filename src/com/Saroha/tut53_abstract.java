package com.Saroha;
  abstract class parent2 {
     public parent2() {
         System.out.println("hii");
     }
     public void Message() {
         System.out.println("good morning");
     }
     abstract public void greet();
     }
    class child2 extends  parent2{//class child2
      //super(x);
        @Override//we use either abstract keyword in class or either we use method override.example of abstract in next class
        //in this class we use method override and next class we use abstract keyword in class implemention child3.
        public void greet() {
            System.out.println("good afternoon!");
        }
        public void Message(int x) {
            System.out.println("this is first subclass");
        }
    }
 abstract class child3 extends  parent2{//class child3
    public void pass() {
        System.out.println("good evening!");
    }
     public void Message1(int x,int y) {
         System.out.println("this is first subclass");
     }
}
    public  class tut53_abstract {
        public static void main(String[] args) {
           // child2 c2=new child2();
            child3 c3=new child3() {
                @Override
                public void greet() {
                }
            };
           // c2.greet();
        }
}

