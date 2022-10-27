import java.util.Scanner;

public class pepcoding4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int a=1;
        int b=1;
        for (int i=1;i<x;i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;

        }
    }
}
