package Sorting;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int arr[]={5,10,50,90,14,56,6,30};
        for(int i=0;i<arr.length;i++){
            int max=0;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    max=j+1;
                }
            }
            int temp=arr[max];
            arr[max]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
