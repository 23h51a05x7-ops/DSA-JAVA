package sliding_window;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class first_neg_element_in_k_size_subArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[]={-8, 2, 3, -6, 10};
        int k=2;
        System.out.println(firstNegInt(nums,k));
    }
    public static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
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
}
