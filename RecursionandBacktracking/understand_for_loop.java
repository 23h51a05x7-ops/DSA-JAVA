package RecursionandBacktracking;

import java.util.ArrayList;
import java.util.List;

public class understand_for_loop {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(permute(nums));
    }
        public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        boolean f[]=new boolean[nums.length];
        for(int i=0;i<f.length;i++){
            f[i]=false;
        }
        help(nums,new ArrayList<>(),ans,f);
        return ans;
    }
    public static void help(int nums[],List<Integer>crr,List<List<Integer>>ans,boolean f[]){
        if(crr.size()==nums.length){
            ans.add(new ArrayList<>(crr));
            System.out.println(ans);
            return;
        }
        for(int s=0;s<nums.length;s++){
            if(f[s]==true){
                continue;
            }
            else{
                crr.add(nums[s]);
                f[s]=true;
            }
            help(nums,crr,ans,f);
            crr.remove(crr.size()-1);
            f[s]=false;
            System.out.println(s);
            System.out.println(crr);
        }
    }
}
