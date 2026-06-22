package input_format;

import java.util.Scanner;

public class line_read {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); // read the whole line or whole seantance once it may be separated with commas or anything
        System.out.println(s);
    }
}
