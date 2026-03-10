package Recursion;

import java.net.Socket;
import java.util.ArrayList;

public class example_understand_of_backtracking {
    static void p(int arr[],ArrayList<Integer>crr,int s){
        if(crr.size()==arr.length){
            System.out.println(crr);
            return;
        }
        for(int i=s;i<arr.length;i++){
            crr.add(arr[i]);
            p(arr,crr,s+1);
            System.out.println("present index:"+i);
            System.out.println("removing elemnt:"+crr.get(crr.size()-1));
            crr.remove(crr.size()-1);
            System.out.print(crr);
        }
        System.out.println();
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        p(arr,new ArrayList<>(),0);
    }
}
