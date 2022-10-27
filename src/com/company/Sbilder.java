package com.company;

public class Sbilder {
    public static void main(String[] args) {
        StringBuilder rg=new StringBuilder("Mayank");
        rg.setCharAt(1,'o');
        System.out.println(rg);

        rg.insert(2,'y');
        System.out.println(rg);

        rg.delete(2,3);
        System.out.println(rg);

        rg.append(2);
        System.out.println(rg);
    }
}
