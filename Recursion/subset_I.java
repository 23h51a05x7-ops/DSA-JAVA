package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset_I {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(subsetsWithDup(nums));
    }
    static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        sub(nums,new ArrayList<>(),0,ans);
        return ans;
    }
    static void sub(int arr[],ArrayList<Integer>crr,int i,List<List<Integer>>ans){
        if(i==arr.length){
            ans.add(new ArrayList<>(crr));
            return;
        }
        crr.add(arr[i]);
        sub(arr,crr,i+1,ans);
        crr.remove(crr.size()-1);
        sub(arr,crr,i+1,ans);
    }
}
