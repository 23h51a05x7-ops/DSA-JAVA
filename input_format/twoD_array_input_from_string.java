package input_format;

import java.util.Arrays;
import java.util.Scanner;

public class twoD_array_input_from_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replace(" ", "");
        String splt[]=s.split(",");
        int arr[][]=new int[3][3];
        int k=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=Integer.parseInt(splt[k]);
                k++;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
