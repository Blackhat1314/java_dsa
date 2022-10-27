import java.util.Scanner;

class ssk{
    public void fun(int n){
        if (n==0)return;
        fun(n-1);
        System.out.println(n);

    }
}


public class Recursion_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userint = sc.nextInt();
        ssk tk = new ssk();

        tk.fun(userint);











    }
}
