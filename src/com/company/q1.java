package com.company;

public class q1 {
    public static void main(String args[]) {
        StringBuilder MyString = new StringBuilder("Hello");
        for (int i = 0; i < MyString.length()/2; i++) {

            int Front= i;
            int Back = MyString.length() -1 -i;

            char front = MyString.charAt(Front);
            char back = MyString.charAt(Back);

            MyString.setCharAt(front, back);
            MyString.setCharAt(back, front);
        }
        System.out.println(MyString);
    }
}
