package RecursionandBacktracking;
import java.util.*;
public class n_queen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n_queen obj=new n_queen();
        List<List<String>>l=new ArrayList<>(obj.solveNQueens(n));
        System.out.println(l);
    }
    public List<List<String>> solveNQueens(int n) {
        char board[][]=new char[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         board[i][j]='.';
        //     }
        // }
        List<List<String>>ans=new ArrayList<>();
        q(board,ans,0);
        return ans;
    }
    public void q(char board[][],List<List<String>>ans,int col){
        if(col==board.length){
            res(board,ans);
            return;
        }
        for(int j=0;j<board.length;j++){
            if(issafe(board,j,col)){
                board[j][col]='q';
                q(board,ans,col+1);
                board[j][col]='.';
            }
        }
    }
    public void res(char board[][],List<List<String>>ans){
        List<String>crr=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String c="";
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='q'){
                    c+='Q';
                }
                else{
                    c+='.';
                }
            }
            crr.add(c);
        }
        ans.add(new ArrayList<>(crr));
        return;
    }
    public boolean issafe(char board[][],int row,int col){
        for(int l=0;l<board.length;l++){
            if(board[row][l]=='q'){
                return false;
            }
        }
        for(int l=0;l<board.length;l++){
            if(board[l][col]=='q'){
                return false;
            }
        }
        int r=row;
        for(int c=col;r>=0&&c>=0;c--,r--){
            if(board[r][c]=='q'){
                return false;
            }
        }
        r=row;
        for(int c=col;c<board.length&&r>=0;r--,c++){
            if(board[r][c]=='q'){
                return false;
            }
        }
        r=row;
        for(int c=col;r<board.length&&c>=0;r++,c--){
            if(board[r][c]=='q'){
                return false;
            }
        }
        r=row;
        for(int c=col;r<board.length&&c<board.length;r++,c++){
            if(board[r][c]=='q'){
                return false;
            }
        }
        return true;
    }
}
