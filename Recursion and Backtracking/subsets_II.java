package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets_II {
    public static void main(String[] args) {
        int nums[]={1,2,2};
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
        int id=i+1;
        while(id<arr.length && arr[id]==arr[id-1]){
            id++;
        }
        sub(arr,crr,id,ans);
    }
}
