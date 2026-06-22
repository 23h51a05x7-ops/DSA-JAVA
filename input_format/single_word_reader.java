package input_format;

import java.util.Scanner;

public class single_word_reader {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(); //if the input:pavan kumar it only read the pavan and dos not read the kumar
        System.out.println(s);
    }
}
