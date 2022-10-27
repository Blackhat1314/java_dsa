package com.company;
class somthing{
    public void reversalArray(int a[], int n){
        int[] arr =new int[n];
        int j = n;
        for (int i=0;i<n;i++){
            arr[j-1] = a[i];
            j--;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

}

public class AllElementsuminarray {
    public static void main(String[] args) {
        somthing lk=new somthing();
        int []a=new int[]{5,4,8,3,9,1};
        lk.reversalArray(a,a.length);
    }
}
