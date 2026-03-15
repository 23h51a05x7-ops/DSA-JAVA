package src.Arrays;

public class container_vth_more_water {
    public static int maxArea(int[] height) {
        int max=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            int d=r-l;
            int h=Math.min(height[l],height[r]);
            int area=h*d;
            max=Math.max(area,max);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
