package src.Arrays;

import java.util.Arrays;

public class sortedSquares {
    public static void main(String[] args) {
        int arr[]={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    public static int[] sortedSquares(int[] nums){
        int arr1[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            double b=0;
            b=Math.pow(nums[i],2);
            arr1[i]=(int)b;
        }
        return arr1;
    }
}
