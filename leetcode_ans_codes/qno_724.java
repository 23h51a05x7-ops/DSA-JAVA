class Solution {
    public int pivotIndex(int[] nums) {
        int left[]=new int[nums.length];
        int totalsum=nums[0];
        for(int i=1;i<nums.length;i++){
            totalsum +=nums[i];
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            int rightsum=totalsum-leftsum-nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum +=nums[i];
        }
        return -1;
    }
}