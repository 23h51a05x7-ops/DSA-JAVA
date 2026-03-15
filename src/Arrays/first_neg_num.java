package src.Arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class first_neg_num {
    static List<Integer> firstNegInt(int arr[], int k) {
        Queue<Integer>q=new LinkedList<>();
        ArrayList<Integer>res=new ArrayList<>();
        int i=0;
        int j=0;
        while(j<arr.length){
            if(arr[j]<0){
                q.offer(arr[j]);
            }
            if(j-i+1==k){
                if(q.isEmpty()){
                    res.add(0);
                }
                else{
                    res.add(q.peek());
                }
                if(!q.isEmpty() && arr[i]==q.peek()){
                    q.poll();
                }
                i++;
            }
            j++;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={-8, 2, 3, -6, 10};
        int k=2;
        System.out.println(firstNegInt(arr, k));
    }
}
