package strings;

import java.util.Scanner;

public class plandrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.next());
        StringBuilder sn=new StringBuilder();
        if(sb.reverse()==sn){
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}
