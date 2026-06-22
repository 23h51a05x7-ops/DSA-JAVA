package sliding_window;

import java.util.Scanner;

public class max_con_ones_II {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[]={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println(longestOnes(nums,k));
    }
    public static int longestOnes(int[] nums, int k) {
        int l=0;
        int max=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                k--;
            }
            while(k<0){
                if(nums[l]==0){
                    k++;
                }
                l++;
            }
            max=Math.max(r-l+1,max);
        }
        return max;
    }
}
