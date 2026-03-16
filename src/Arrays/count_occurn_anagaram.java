package src.Arrays;

import java.util.HashMap;

public class count_occurn_anagaram {
    static int search(String s, String pat) {
        HashMap<Character,Integer>m=new HashMap<>();
        HashMap<Character,Integer>m1=new HashMap<>();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i))){
                m.put(s.charAt(i),m.get(s.charAt(i))+1);
            }
            else{
                m.put(s.charAt(i),1);
            }
        }
        int i=0;
        int j=0;
        while(j<pat.length()){
            if(m1.containsKey(pat.charAt(j))){
                m1.put(pat.charAt(j),m1.get(pat.charAt(j))+1);
            }
            else{
                m1.put(pat.charAt(j),1);
            }
            if(j-i+1==s.length()){
                if(m.equals(m1)){
                    c++;
                }
                char ch = pat.charAt(i);
                m1.put(ch, m1.get(ch) - 1);
                if(m1.get(ch) == 0){
                     m1.remove(ch);
                }
                i++;
            }
            j++;
        }
        return c;
    }
    public static void main(String[] args) {
        String txt="forxxorfxdofr";
        String pat = "for";
        System.out.println(search(pat, txt));
    }
}