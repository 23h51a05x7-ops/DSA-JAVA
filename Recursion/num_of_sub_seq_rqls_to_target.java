package Recursion;

import java.util.ArrayList;

public class num_of_sub_seq_rqls_to_target {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5};
        int target=5;
        ArrayList<ArrayList<Integer>>r=new ArrayList<>();
        boolean f= false;
       int res= sub_sum(arr,target,r,0,0,new ArrayList<>());
        System.out.println(r);
        System.out.println(res);
    }
    static int sub_sum(int arr[],int target,ArrayList<ArrayList<Integer>>r,int i,int sum,ArrayList<Integer>crr){
        if(i==arr.length){
            if(sum==target){
                r.add(new ArrayList<>(crr));
                return 1;
            }
            else{
                return 0;
            }
        }
        crr.add(arr[i]);
        sum=sum+arr[i];
        int l=sub_sum(arr, target, r, i+1, sum, crr);
        sum=sum-arr[i];
        crr.remove(crr.size()-1);
        int ri=sub_sum(arr, target, r, i+1, sum, crr);
        return l+ri;
    }
}
