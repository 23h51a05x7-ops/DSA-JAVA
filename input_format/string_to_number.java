package input_format;

import java.util.Arrays;
import java.util.Scanner;

public class string_to_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s);
        String splt[]=s.split(",");
        System.out.println(Arrays.toString(splt));
        int arr[]=new int[splt.length];
        for(int i=0;i<splt.length;i++){
            int num=Integer.parseInt(splt[i]);
            arr[i]=num;
        }
        System.out.println(Arrays.toString(arr));
    }
}
