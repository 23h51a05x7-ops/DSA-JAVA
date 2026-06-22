package patterns;

public class p18 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            char c = (char)('e' - i + 1);
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
