package com.company;

public class String_q1 {
    public static void main(String[] args) {
        String pk="this is mayank";
        String kk=pk.substring(8,pk.length());
        System.out.println(kk);
//
        String mm="sony";
        String pp="tony";
        if( mm.compareTo(pp)>0){
            System.out.println("its a positive");
        }
        else if (mm.compareTo(pp)<0){
            System.out.println("its a negativ");
        }
        else{
            System.out.println("equal");

        }
        StringBuilder MyString = new StringBuilder("Hello");
        for (int i = 0; i < MyString.length()/2; i++) {

            int Front= i;
            int Back = MyString.length() -1 - i;

            char front = MyString.charAt(Front);
            char back = MyString.charAt(Back);

            MyString.setCharAt(front, back);
            MyString.setCharAt(back, front);
        }
        System.out.println(MyString);

    }
}
