package searching;

import java.util.Scanner;

class linear_search {
public static void main(String[] args) {
    int arr[]={2,3,4,5,6,10};
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   int r=search(arr,n);
   System.out.println(r);
}
  static int search(int a[],int m) {
    if(a.length==0) return -1;
  for(int i=0;i<a.length;i++){
    if(a[i]==m){
        return i;
  }
  }
  return -1;
  }   
}