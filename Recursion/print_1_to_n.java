package Recursion;
import java.util.*;;
public class print_1_to_n{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        number(n);
    }
    static void number(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        number(n-1);
    }
}