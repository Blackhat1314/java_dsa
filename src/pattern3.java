public class pattern3 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


class Solution {

    void printSquare(int n) {
        for(int row=0;row<n;row++) {
            for(int col=0;col<n;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}