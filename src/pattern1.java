import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
      int x=10;
      int y=15;
      int sum=x+y;
        System.out.println(sum);

        int mul=x*y;
        System.out.println(mul);

        int p1=y/x;
        int p2=x/y;
        int p3=y%x;
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        int bod=(y*x)/(y+x);
        System.out.println(bod);

        int a=10;
        if(a%2==0){
            System.out.println(a +" is even");
        }
        else{
            System.out.println(a +"is odd");
        }
            System.out.println("kdusdnhds ksdjhjsb kdjhsk");

        int n1=20;
        int n2=20;
        if (n1==n2){
            System.out.println(n1 +" is equal to "+ n2);
        }

        else if (n1>n2){
                System.out.println(n1 +" is greter then "+ n2);
            }
            else {
                System.out.println(n1 +" is less then "+ n2);
            }




            //input
//        Scanner sc=new Scanner(System.in);
//            int marks= sc.nextInt();
//
//            if (marks> 90){
//                System.out.println("exeleant");
//            }
//            else if(marks> 80){
//                System.out.println("good");
//            }
//            else if (marks>70){
//                System.out.println("fair");
//            }
//            else if (marks>60){
//                System.out.println("meet expectation");
//            }
//            else {
//                System.out.println("below par");
//            }
//


      Scanner de=new Scanner(System.in);
//            int m=Integer.parseInt(de.nextLine());
            int m= de.nextInt();
            String name= de.nextLine();
            for (int i = 0; i <= m; i++) {
           System.out.println(i);
           }
            System.out.println("my name is  "+ name);


    }
}
