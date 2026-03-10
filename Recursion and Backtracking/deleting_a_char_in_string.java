package Recursion;

public class deleting_a_char_in_string {
    public static void main(String[] args) {
        String s="pavan";
        delete(s,"",0);
    }   
    static void delete(String s,String ans,int i){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        char c=s.charAt(i);
        if(c=='a'){
            delete(s, ans, i+1);
        }
        else{
            ans=ans+c;
            delete(s, ans,i+1);
        }
    }
}
