package sliding_window;
import java.util.*;
public class max_num_vowels_instrig {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        System.out.println(maxVowels(s,k));
    }
    public static int maxVowels(String s,int k){
        int count=0;
        int max=Integer.MIN_VALUE;
        HashMap<Character,Integer>m=new HashMap<>();
        m.put('a',1);
        m.put('e',1);
        m.put('i',1);
        m.put('o',1);
        m.put('u',1);
        int j=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(m.containsKey(c)){
                count++;
            }
            if(i-j+1==k){
                max=Math.max(max,count);
                if(m.containsKey(s.charAt(j))){
                    count--;
                }
                j++;
            }
        }        
        return max;
    }
}
