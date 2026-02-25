package searching;
import java.util.*;
public class ceeling_of_num {
    public static void main(String[] args) {
        int arr[]={1,2,5,9,14,16,18};
        int cellingof=15;
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=(s+(e-s))/2;
            if(arr[mid]==cellingof){
                System.out.println(arr[mid]);
                return;
            }
            if(arr[mid]>cellingof){
                e=mid-1;
            }
           if(arr[mid]<cellingof){
                s=mid+1;
            } 
        }
        System.out.println(arr[s]);
    }
}
