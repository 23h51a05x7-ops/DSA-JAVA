package RecursionandBacktracking;

import java.util.Scanner;

import oops.static_block;

public class n_queen {
    static int count=0;
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int board[][]={{1,2,3},{4,5,6}, {7,8,9}};
        boolean v[][]=new boolean[3][3];
        helper(board,0,v);
    }
    public static void helper(int board[][],int col,boolean v[][]){
        if(col>=board.length){
            return;
        }
        for(int j=0;j<board.length;j++){
            if(v[j][col]){
                continue;
            }
            v[j][col]=true;
            System.out.println(board[j][col]);
            helper(board, col+1,v);
            v[j][col]=false;
        }
    }
}
