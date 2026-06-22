package input_format;

import java.util.Arrays;
import java.util.Scanner;

public class space_separated {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String splt[]=s.trim().split("\\s+"); //if space separated then wright " " if comma separated the write ","
        int arr[]=new int[splt.length];
        for(int i=0;i<splt.length;i++){
            arr[i]=Integer.parseInt(splt[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
//for nqt for space separated use        String[] arr = sc.nextLine().trim().split("\\s+");