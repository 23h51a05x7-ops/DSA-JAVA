package searching;

public class serach_in_twoD {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},
            {4,5,6,9},
            {7,8}
        };
        int n=99;
        System.out.println(search(arr,n));
    }
    static boolean search(int [][]a,int m){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                    if(a[i][j]==m) return true;
            }
        }
        return false;
    }
}
