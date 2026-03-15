package src.Arrays;

import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;

public class max_sum_pair {
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int c=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]==k){
                c++;
                j--;
                i++;
            }
            else if(nums[i]+nums[j]>k){
                j--;
            }
            else{
                i++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int k=5;
        System.out.println(maxOperations(nums, k));
    }
}
