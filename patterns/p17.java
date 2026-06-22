package patterns;

public class p17 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i-1;j++){
                System.out.print(" ");
            }
            char c='a';
            int breakpoint=(2*i+1)/2;
            for(int j=0;j<2*i+1;j++){
                System.out.print(c);
                if(j<=breakpoint){
                    c++;
                }
                else{
                    c--;
                }
            }
            for(int j=0;j<5-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
