package greedy;

import java.util.PriorityQueue;
import java.util.Scanner;

public class min_num_of_dishes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int r[]=new int[n];
        PriorityQueue<Integer>p=new PriorityQueue<>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
            r[i]=a[i]/b[i];
            p.add(r[i]);
        }
        while (p.size()!=0 && k!=0) {
            int c=p.poll();
            if(c<k){
                c +=p.peek()-k;
            }
        }
    }
}
