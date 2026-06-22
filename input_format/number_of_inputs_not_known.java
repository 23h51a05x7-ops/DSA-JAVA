package input_format;

import java.util.Scanner;

public class number_of_inputs_not_known {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            String line=sc.nextLine();
            System.out.println(line);
        }
    }
}
