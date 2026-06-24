    package RecursionandBacktracking;

    import java.util.ArrayList;
    import java.util.List;

    import oops.static_block;

    public class path_from_first_index_to_lastindex {
        public static void main(String[] args) {
            
            int[][] mat = {
            {1, 1, 1, 1},
            {1, 0, 1, 1},
            {1, 1, 1, 0},
            {1, 1, 1,1}
            };
            List<List<Character>>res=(path(mat));
            System.out.println(res);
        }
        public static List<List<Character>> path(int mat[][]){
            List<List<Character>>ans=new ArrayList<>();
            help(mat,ans,0,0,new ArrayList<>());
            return ans;
        }
        public static void help(int mat[][],List<List<Character>>res,int i,int j,List<Character>crr){
            if(i>=mat.length||j>=mat.length){
                return;
            }
            if(mat[i][j]==0){
                return;
            }
            if(i==mat.length-1&&j==mat.length-1){
                res.add(new ArrayList<>(crr));
                return;
            }
            crr.add('r');
            help(mat, res, i, j+1, crr);
            crr.remove(crr.size()-1);
            crr.add('d');
            help(mat, res, i+1, j, crr);
            crr.remove(crr.size()-1);
        }
    }
