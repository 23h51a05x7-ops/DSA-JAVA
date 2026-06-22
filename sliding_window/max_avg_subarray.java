package sliding_window;
import java.util.*;
public class max_avg_subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(help(nums,k));
    }
    public static double help(int nums[],int k){
        int j=0;
        int sum=0;
        double avg=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            double a=0;
            if(i-j+1==k){
                a=(double)sum/k;
                avg=Math.max(a,avg);
                sum-=nums[j];
                j++;
            }
        }
        return avg;
    }
}
