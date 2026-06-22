package src.Arrays;
import java.util.*;
public class equalibrum_index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pf[]=new int[n];
        pf[0]=arr[0];
        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]+arr[i];
        }
        for(int i=1;i<n;i++){
            int l=pf[i-1];
            int r=pf[n-1]-pf[i];
            if(r==l){
                System.out.println("true");
            }
        }
    }
}
