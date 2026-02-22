package Recursion;
import java.util.*;;
public class print_n_1 {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        number(n);
    }
    static void number(int n){
        if(n==0){
            return;
        }
        number(n-1);
        System.out.println(n);
    }
}