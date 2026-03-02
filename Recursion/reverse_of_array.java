package Recursion;

import java.util.Arrays;

public class reverse_of_array {
    public static void main(String[] args) {
        int  arr[]={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        rev(arr,0,n);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int arr[],int i,int n){
        if(i>n/2){
            return;
        }
        int t=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=t;
        rev(arr,i+1,n);
    }
}