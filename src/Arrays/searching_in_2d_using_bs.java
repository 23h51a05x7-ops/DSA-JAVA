package src.Arrays;

public class searching_in_2d_using_bs{
    public static void main(String[] args) {
        int arr[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=23;
        System.out.println(searchMatrix(arr,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int r=0;
        int c=matrix[0].length-1;
        while(r<matrix.length && c>=0){
            if(target>matrix[r][c]){
                r++;
            }
            else if(target<matrix[r][c]){
                c--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
