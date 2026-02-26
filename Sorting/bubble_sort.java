package Sorting;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int arr[]={5,10,50,90,14,56,6,30};
        for(int i=0;i<arr.length;i++){
            boolean swap=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
