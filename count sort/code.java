import java.util.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Count Sort");
        int r[]={8,6,8,7,1,6};
        sort(r);
        System.out.print(Arrays.toString(r));
    }
    public static void sort(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int c[]=new int[max+1];
        for(int k:arr){
            c[k]++;
        }
        int j=0;
        for(int i=0;i<=max;i++){
            while(c[i]>0){
                arr[j]=i;
                j++;
                c[i]--;
            }
        }
    }
}