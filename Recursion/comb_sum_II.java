package Recursion;
import java.util.*;
class comb_sum_II{
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>r=new ArrayList<>();
        sum(candidates,target,r,new ArrayList<>(),0,0);
        List<List<Integer>>r1=new ArrayList<>(r);
        return r1;
    }
    static void sum(int arr[],int target,List<List<Integer>>r,ArrayList<Integer>crr,int i,int sum){
        if(sum==target){
            r.add(new ArrayList<>(crr));
            return;
        }
        for(int start=i;start<arr.length;start++){
            if(start > i && arr[start] == arr[start-1]) continue;
            if(sum+arr[start]>target) break;
            crr.add(arr[start]);
            sum(arr, target, r, crr, start + 1, sum + arr[start]);
            crr.remove(crr.size()-1);
        }

    }
    public static void main(String[] args) {
        int arr[]={10,1,2,7,6,1,5};
        int target=8;
        System.out.println(combinationSum2(arr,target));
    }
}