package src.Arrays;
import java.util.*;
class twoSum{
    public static int[] sum(int[] numbers, int target) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            m.put(numbers[i],i+1);
        }
        for(int i=0;i<numbers.length;i++){
            int r=target-numbers[i];
            if(m.containsKey(r)){
                return new int[]{i+1,m.get(r)};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[]={1,4,7,6,342,5,65,34};
        int target=69;
        System.out.println(sum(arr,target));
    }
}