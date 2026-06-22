package sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class count_dist_elemts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[]={1, 2, 1, 3, 4, 2, 3};
        int k=4;
        System.out.println(countDistinct(nums,k));
    }
    public static ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        HashMap<Integer,Integer>set=new HashMap<>();
        ArrayList<Integer>ans=new ArrayList<>();
        int l=0;
        for(int r=0;r<arr.length;r++){
            set.put(arr[r],set.getOrDefault(arr[r],0)+1);
            if(r-l+1==k){
                ans.add(set.size());
                if(set.get(arr[l])>1){
                    int n1=set.get(arr[l])-1;
                    set.put(arr[l],n1);
                }
                else{
                    set.remove(arr[l]);
                }
                l++;
            }
        }
        return ans;
    }
}
