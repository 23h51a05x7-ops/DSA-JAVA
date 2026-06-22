package patterns;

public class p15 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            char c='A';
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}
