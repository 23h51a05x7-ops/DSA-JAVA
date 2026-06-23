package RecursionandBacktracking;

import java.util.Scanner;

import oops.static_block;

public class n_queen {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean board[][]=new boolean[n][n];
        helper(board,0);
    }
    public static void helper(boolean board[][],int col){
        if(col>=board.length){
            count++;
            return;
        }
    }
}
