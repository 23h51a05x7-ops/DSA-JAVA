import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char bord[][]=new char[3][3];
        for(int i=0;i<bord.length;i++){
            for(int j=0;j<bord[i].length;j++){
                bord[i][j]=' ';
            }
        }
        char player='x';
        boolean gameover=false;
        while(!gameover){
            printbord(bord);
            System.out.println("player "+player+" enter");
            int row=sc.nextInt();
            int col=sc.nextInt();
            System.out.println();
            if(bord[row][col]==' '){
                bord[row][col]=player;
                gameover=havewon(bord,player);
                if(gameover){
                    System.out.println("player "+player+" won the game");
                }
                else{
                    player=(player=='x')? '0':'x';
                }
            }
            else{
                System.out.println("invalid move try again");
            }
        }
        printbord(bord);
    }
    public static void printbord(char bord[][]){
      for(int i=0;i<bord.length;i++){
            for(int j=0;j<bord[i].length;j++){
                System.out.print(bord[i][j]+"|");
            }
            System.out.println();
        }  
    }
    public static boolean havewon(char bord[][],char player){
        for(int row=0;row<bord.length;row++){
            if(bord[row][0]==player && bord[row][1]==player && bord[row][2]==player){
                return true;
            }
        }
        for(int row=0;row<bord[0].length;row++){
            if(bord[0][row]==player && bord[1][row]==player && bord[2][row]==player){
                return true;
            }
        }
        if(bord[0][0]==player && bord[1][1]==player&& bord[2][2]==player){
            return true;
        }
        if(bord[0][2]==player && bord[1][1]==player&& bord[2][0]==player){
            return true;
        }
        return false;
    }
}