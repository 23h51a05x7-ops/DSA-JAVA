package RecursionandBacktracking;
import java.util.*;
public class ip {
    private static boolean valid(String seg){
        if ( seg.length()>3 || seg.length()<=0 || (seg.length()>1 &&seg.charAt(0)=='0')) return false;
        int value= Integer.parseInt(seg);
        return 255>=value && value>=0;
    }
    private static void helper(int i , String s, String curr, int count , List<String> res){
        if (count==3){
            if (valid(s.substring(i, s.length()))){
                curr+= s.substring(i, s.length());
                res.add(curr);
            }
            return;
        }
        String temp="";
        for(int k =i; k<Math.min(s.length(),i+3); k++){
            temp+=s.charAt(k);
            if(valid(temp)){
                helper(k+1, s, curr+temp+".", count+1, res);
            }
        }
    }
    public List<String> restoreIpAddresses(String s) {
        List<String> res= new ArrayList<>();
        helper(0, s, "", 0, res);
        return res;
    }
}