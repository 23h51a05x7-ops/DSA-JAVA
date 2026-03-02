package Recursion;
import java.util.ArrayList;

public class sub_seq_sum_rqls_to_target {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5};
        int target=5;
        ArrayList<ArrayList<Integer>>r=new ArrayList<>();
        boolean f= false;
        sub_sum(arr,target,r,0,0,new ArrayList<>());
        System.out.println(r);
    }
    static void sub_sum(int arr[],int target,ArrayList<ArrayList<Integer>>r,int i,int sum,ArrayList<Integer>crr){
        if(i==arr.length){
            if(sum==target){
                r.add(new ArrayList<>(crr));
            }
            return;
        }
        crr.add(arr[i]);
        sum=sum+arr[i];
        sub_sum(arr, target, r, i+1, sum, crr);
        sum=sum-arr[i];
        crr.remove(crr.size()-1);
        sub_sum(arr, target, r, i+1, sum, crr);
    }
}
