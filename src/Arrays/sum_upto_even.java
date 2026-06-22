package src.Arrays;
import java.util.*;
public class sum_upto_even {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        int c=0;
        for(int i=0;i<l.size();i++){
            for(int j=i+1;j<l.size();j++){
                if((l.get(i)+l.get(j))%2==0){
                    c++;
                }
            }
        }
            System.out.println(c);
    }
}
