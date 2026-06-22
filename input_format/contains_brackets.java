package input_format;

import java.util.Arrays;
import java.util.Scanner;

public class contains_brackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s = s.replaceAll("[\\[\\]{}\\/]", "");
        s=s.replace(" ","");
        String splt[]=s.split(","); //if space separated then wright " " if comma separated the write ","
        int arr[]=new int[splt.length];
        for(int i=0;i<splt.length;i++){
            arr[i]=Integer.parseInt(splt[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
