package com.company;
class maxsumarray{
    int maxarraysumarray(int a[]){
        int maxsum=0;
        int currsum=0;

        for(int i=0;i<a.length;i++){
            currsum=currsum +a[i];
            if(currsum>maxsum){
                maxsum=currsum;
            }
            if(currsum<0){
                currsum=0;
            }
        }
        return maxsum;
    }

}

public class ds1 {
    public static void main(String[] args) {
        maxsumarray s1= new maxsumarray();
        int [] asd=new int[]{4,-5,3,7,-7};
        System.out.println(s1.maxarraysumarray(asd));
    }
}
