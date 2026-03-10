package Recursion;

import java.util.Scanner;

public class understang_recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        number(n);
    }
    static void number(int n){
        if(n==0){
            return;
        }
        System.out.println("Hello " + n);
        number(n-1);
        System.out.println("Hello " + n);
    }
}
