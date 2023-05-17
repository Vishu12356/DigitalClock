package com.vishu.tutorial;

public class AccessModifier1 {

    /**
     * private -> same package same class
     * default -> same package different class
     * protected -> different package with inheritance
     * public -> different package different class
    */
     protected void print () {
        System.out.println("Access Modifier 1");
    }

    public static void main(String[] args) {
        AccessModifier1 acm = new AccessModifier1();
        acm.print();
        AccessModifier2 accessModifier2 = new AccessModifier2();
        accessModifier2.getVar2();

        accessModifier2.setVar2(8);
    }
}
