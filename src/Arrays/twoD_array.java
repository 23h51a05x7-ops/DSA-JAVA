package src.Arrays;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class twoD_array {
    public static void main(String args[]){
            Scanner s =new Scanner(System.in);
            int arr[][]=new int[3][3];
            for(int r=0;r<arr.length;r++){
                for(int c=0;c<arr[r].length;c++){
                    arr[r][c]=s.nextInt();
                }
            }
            for(int []c:arr){
                System.out.println(Arrays.toString(c));
            }
    }
}
