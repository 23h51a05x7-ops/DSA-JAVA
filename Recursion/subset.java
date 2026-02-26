package Recursion;

import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        subset(arr,0,new ArrayList<>(),ans);
        System.out.println(ans);
    }
    static void subset(int arr[],int i,ArrayList<Integer>res,ArrayList<ArrayList<Integer>>ans){
        if(i==arr.length){
            ans.add(new ArrayList<>(res));
            return;
        }
        res.add(arr[i]);
        subset(arr, i+1, res,ans);
        System.out.println(i);
        res.remove(res.size()-1);
        subset(arr, i+1, res,ans);
    }
}
