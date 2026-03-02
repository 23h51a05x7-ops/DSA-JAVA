package Sorting;

import java.util.Arrays;

public class cyclic_sort {
    static void sort(int arr[]){
        int i=0;
        while (i<arr.length) {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int arr[],int i,int correct){
        int t=arr[i];
        arr[i]=arr[correct];
        arr[correct]=t;
    }
    public static void main(String[] args) {
        int arr[]={5,7,6,1,3,2,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
