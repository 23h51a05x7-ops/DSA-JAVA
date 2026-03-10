package Recursion;

public class numRollsToTarget {
    public static int numRollsToTarget(int n, int k, int target) {
        return s(n,k,target,0,0);
    }
    static int s(int n, int k,int target,int sum,int ans){
        if(sum==target && n==0){
            return ans +=1;
        }
        if(n==0){
            return 0;
        }
        if(sum > target){
            return 0;
        }
        for(int i=1;i<=k;i++){
            sum=sum+i;
             ans=ans+s(n-1,k,target,sum,0);
            sum=sum-i;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(numRollsToTarget(30,30,500));
    }
}
