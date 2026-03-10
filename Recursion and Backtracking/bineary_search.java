package Recursion;

public class bineary_search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int target=3;
        System.out.println("Position of element "+target+" is:"+search(arr,target,0,arr.length-1));
    }
    static int search(int arr[],int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target>arr[mid]){
            return search(arr, target, mid+1, e);
        }
        else{
            return search(arr, target, s, mid-1);
        }
    }
}
