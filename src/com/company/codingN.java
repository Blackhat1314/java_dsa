package com.company;
import java.util.Scanner;
public class codingN {
    class Solution {

        static String reverseEachWord(String input)
        {
            String ss="";
            String sa="";
            for(int i=0;i<input.length();i++){
                if(input.charAt(i)==' ') {
                    sa= sa+" "+ss;
                    ss="";
                }
                else {
                    ss=input.charAt(i)+ss;
                }
            }
            return sa+" "+ss;
        }

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String ans = reverseEachWord(input);
            System.out.println(ans);
        }
    }
}
