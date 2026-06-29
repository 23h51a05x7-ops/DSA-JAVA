package oops;

import java.util.Scanner;

public class exceptions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            divide(a, b);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
        System.out.println("this will executet if the above code executes or not");
        }
    }
    public static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("please do not divide with 0");
        }
        return a/b;
    }
}
