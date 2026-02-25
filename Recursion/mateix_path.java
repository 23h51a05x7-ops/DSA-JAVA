package Recursion;

public class mateix_path {
    static int path(int arr[][],int r,int c,int rl,int cl){
        if(r==rl && c==cl){
            return 1;
        }
        if(r>rl||c>cl){
            return 0;
        }
        int r1=path(arr, r+1, c, rl, cl);
        int c1=path(arr, r, c+1, rl, cl);
        return r1+c1;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int rl=3;
        int cl=3;
        System.out.println(path(arr,0,0,rl-1,cl-1));
    }
}
