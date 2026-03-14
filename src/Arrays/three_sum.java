package src.Arrays;
import java.util.*;
public class three_sum {
    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        List<List<Integer>>arr=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            tp(nums,i+1,nums.length-1,nums[i],arr);
        }
       return arr;
    }
    static void tp(int nums[],int b,int c,int target,List<List<Integer>>arr){
        while(b<c){
        if(nums[b]+nums[c]==-target){
            arr.add(new ArrayList<>(Arrays.asList(target,nums[b],nums[c]))); 
            b++;
            c--;
            while(b < c && nums[b] == nums[b-1]) b++;
            while(b < c && nums[c] == nums[c+1]) c--;
        }
        else if(nums[b]+nums[c]>-target){
            c--;
        }
        else{
            b++;
        }
        }
    }

}