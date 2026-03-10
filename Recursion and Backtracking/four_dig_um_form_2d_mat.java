package Recursion;
import java.util.*;;
public class four_dig_um_form_2d_mat {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                    arr[i][j]=sc.nextInt();
            }
        }
        ArrayList<Integer>rs=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    continue;
                }
                else{
                    num(arr,i,j,rs,1,0,n,m);
                }
            }
        }
        int max=rs.get(0);
        for(int rx:rs){
            max=Math.max(rx,max);
        }
        System.out.println(max);
    }
    public static void num(int arr[][],int i,int j,ArrayList<Integer>rs,int digits,int sum,int n,int m){
            sum=sum*10+arr[i][j];
        if(digits==4){
            rs.add(sum);
            return;
        }
        if(digits>4){
            return;
        }
                if(j+1<m){
                    num(arr,i,j+1,rs,digits+1,sum,n,m);
                }
                if(i+1<n){
                    num(arr,i+1,j,rs,digits+1,sum,n,m);
                }
                if(j-1>=0){
                    num(arr,i,j-1,rs,digits+1,sum,n,m);
                }
                if(i-1>=0){
                    num(arr,i-1,j,rs,digits+1,sum,n,m);
                }
            }
}
