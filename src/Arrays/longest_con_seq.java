package src.Arrays;

import java.util.Arrays;

public class longest_con_seq {
    public static int ln(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int max=0;
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1||nums[i]==nums[i+1]){
                c++;
            }
            else{
                max=Math.max(c,max);
                c=0;
            }
        }
        return max+1;
    }
    public static void main(String[] args) {
        int nums[]={0,3,7,2,5,8,4,6,0,1};
        System.out.println(ln(nums));
    }
}