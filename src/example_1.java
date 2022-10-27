class gg{
    public boolean palindrown(int a){
        int rim=0;
        int que=a;
        while(que>0){
            rim=(rim*10)+(que%10);
            que=que/10;
        }
        if(rim==a){
            return true;
        }
        return false;
    }
}
public class example_1 {
    public static void main(String[] args) {
        gg s = new gg();
        System.out.println(s.palindrown(121));


    }
}
