
class dhruti{
    public static int kadans(int a[]){
        int len=a.length;
        int current=0;
        int max=0;
        for(int i=0;i<a.length;i++){

            current=current+a[i];
            if(current>max){
                max=current;
            }
            if(current<0){
                current=0;
            }
        }
        return max;
    }
}
public class maxsum {
    public static void main(String[] args) {
     dhruti hu=new dhruti();

    }
}
