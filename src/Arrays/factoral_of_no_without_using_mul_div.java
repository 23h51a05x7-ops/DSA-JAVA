package src.Arrays;

import java.util.Scanner;

public class factoral_of_no_without_using_mul_div {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=1;
        for(int i=2;i<=n;i++){
            int num=0;
            for(int j=1;j<=i;j++){
                num+=sum;
            }
            sum=num;
        }
        System.out.println(sum);
    }
}
