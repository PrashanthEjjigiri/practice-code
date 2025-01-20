package com.java.Logical;

public class FindLargeAmong3 {

    public static void main(String[] args) {
        int arr[]={1,2,3,100,4,5,6,7};
int max = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);
    }
}
