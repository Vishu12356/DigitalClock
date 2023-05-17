package com.vishu.tutorial;

public class AccessModifier2 {

     private static int var1 = 5;
  static int var2 = 6;
    public int getVar2 () {
        return var2;
    }
 public void setVar2 (int var2) {
        this.var2 = var2;
    }
    private void sum (int a, int b) {
        System.out.println("Sum : " + a + b);
    }

    public static void main(String[] args) {
        AccessModifier1 acm = new AccessModifier1();
        acm.print();

        AccessModifier2 acm21 = new AccessModifier2();
        System.out.println(acm21.var2);
        System.out.println("static : " + AccessModifier2.var1);
        acm21.var2 = 8;
        AccessModifier2.var1 = 9;
        System.out.println("static : " + AccessModifier2.var1);
        System.out.println(acm21.var2);

        AccessModifier2 acm22 = new AccessModifier2();
        System.out.println(acm22.var2);
        acm22.var2 = 9;
        System.out.println("static : " + AccessModifier2.var1);
        System.out.println(acm22.var2);

        AccessModifier2 acm23 = new AccessModifier2();
        System.out.println(acm23.var2);
        acm23.var2 = 10;
        System.out.println(acm23.var2);
    }
}
