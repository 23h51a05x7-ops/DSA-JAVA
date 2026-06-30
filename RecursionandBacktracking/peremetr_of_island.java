package RecursionandBacktracking;

public class peremetr_of_island {
    public static void main(String[] args) {
        int grid[][]={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        peremetr_of_island obj=new peremetr_of_island();
        System.out.println(obj.islandPerimeter(grid));
    }
    public int islandPerimeter(int[][] grid) {
        boolean v[][]=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return help(grid,i,j,v);
                }
            }
        }
        return 0;
    }
    public int help(int grid[][],int i ,int j,boolean v[][]){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length){
            return 1;
        }
        if(grid[i][j]==0){
            return 1;
        }
        if(v[i][j]){
            return 0;
        }
        v[i][j]=true;
        int u=help(grid,i,j+1,v);
        int d=help(grid,i,j-1,v);
        int r=help(grid,i+1,j,v);
        int l=help(grid,i-1,j,v);
        return u+d+r+l;
    }
}
