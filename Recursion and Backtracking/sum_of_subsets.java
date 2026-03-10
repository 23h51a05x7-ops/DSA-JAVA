package Recursion;
import java.util.*;
class sum_of_subsets{
    public static void main(String[] args) {
        int arr[]={3,1,2};
        System.out.println(sum(arr));
    }
    static List<Integer> sum(int arr[]){
        List<Integer>r=new ArrayList<>();
        sum_of(arr,r,0,0);
        Collections.sort(r);
        return r;
    }
    static void sum_of(int arr[],List<Integer>r,int sum,int i){
        if(i>=arr.length){
            r.add(sum);
            return;
        }
        sum=sum+arr[i];
        sum_of(arr, r, sum, i+1);
        sum=sum-arr[i];
        sum_of(arr, r, sum, i+1);
    }
}