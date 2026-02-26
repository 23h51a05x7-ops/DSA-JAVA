package src.Arrays;
import java.util.*;
public class max_element_in_2d_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
                max=Math.max(max,arr[i][j]);
            }
        }
        System.out.println("the max_element_in_2d_array:"+max);
    }
}
