package com.company;

import java.util.Scanner;

public class function1 {
    public int square(int x) {
        int sq;
        sq=x*x;
        return sq;
    }

    public int sum(int y){
         int f =square(y);
        int su;
        su=y+y;
        int k = su+f;
        return k;
    }





    public static void main(String[] args) {
        function1 shruti=new function1();

        System.out.println(shruti.sum(3));


    }
}
// pallavi mayank kadgdfjhsdfhjsbshdduyjdf