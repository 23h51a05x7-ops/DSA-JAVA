package RecursionandBacktracking;

import java.util.ArrayList;
import java.util.List;

public class count_path_in_grid {
        public static void main(String[] args) {
            
            int[][] mat = {
            {1, 1, 1, 1},
            {1, 0, 1, 1},
            {1, 1, 1, 0},
            {1, 1, 1,1}
            };
            int res=(path(mat));
            System.out.println(res);
            List<List<int []>>ans=pathcord(mat);
            for (List<int[]> path : ans) {
                for (int[] cell : path) {
                    System.out.print("(" + cell[0] + "," + cell[1] + ") ");
                }
                System.out.println();
            }
        }
        public static int path(int mat[][]){
            return help(mat,0,0);
        }
        public static int help(int mat[][],int i,int j){
            if(i>=mat.length||j>=mat.length){
                return 0;
            }
            if(mat[i][j]==0){
                return 0;
            }
            if(i==mat.length-1&&j==mat.length-1){
                return 1;
            }
            int l=help(mat, i, j+1);
            int r=help(mat, i+1, j);
            return l+r;
        }
        public static List<List<int[]>> pathcord(int mat[][]){
            List<List<int []>>ans=new ArrayList<>();
            helper(mat,ans,0,0,new ArrayList<>());
            return ans;
        }
        public static void helper(int mat[][],List<List<int []>>res,int i,int j,List<int[]>crr){
            if(i>=mat.length||j>=mat.length){
                return;
            }
            if(mat[i][j]==0){
                return;
            }
            int arr[]={i,j};
            crr.add(arr);
            if(i==mat.length-1&&j==mat.length-1){
                res.add(new ArrayList<>(crr));
                crr.remove(crr.size()-1);
                return;
            }
            helper(mat, res, i, j+1, crr);
            helper(mat, res, i+1, j, crr);
            crr.remove(crr.size()-1);
        }
}
