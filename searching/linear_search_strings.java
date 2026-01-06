package searching;

import java.util.Scanner;

public class linear_search_strings {
    public static void main(String[] args) {
    String s="pavan kumar";
    Scanner sc=new Scanner(System.in);
    char c = sc.next().charAt(0);
     System.out.println(search(s,c));
}
  static boolean search(String st,char m) {
    if(st.length()==0) return false;
  for(int i=0;i<st.length();i++){
    char k=st.charAt(i);
    if(k==m){
        return true;
  }
  }
  return false;
  }    
}
