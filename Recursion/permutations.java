package Recursion;
import java.util.*;
import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>>ans=new ArrayList<>();
        boolean frq[]=new boolean[arr.length];
        perm(arr,ans,new ArrayList<>(),frq);
        System.out.println(ans);
    }
    static void perm(int arr[],List<List<Integer>>ans,ArrayList<Integer>crr,boolean frq[]){
        if(crr.size()==arr.length){
            ans.add(new ArrayList<>(crr));
            return;
        }
        for( int i=0;i<arr.length;i++){
            if(frq[i]==false){
                frq[i]=true;
                crr.add(arr[i]);
                perm(arr, ans, crr, frq);
                crr.remove(crr.size()-1);
                frq[i]=false;
            }
        }
    }
}
 