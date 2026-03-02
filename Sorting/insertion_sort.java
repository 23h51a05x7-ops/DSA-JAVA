package Sorting;

import java.util.Arrays;

public class insertion_sort {
    public static void sorte(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[]={5,1,50,90,14,56,6,30};
        sorte(arr);
        System.out.println(Arrays.toString(arr));
    }
}
