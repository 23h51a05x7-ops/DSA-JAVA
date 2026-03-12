
import java.util.ArrayList;
import java.util.List;

public class phone_number {
    public static void main(String[] args) {
        String s="23";
        System.out.println(letterCombinations(s));
    }
    public static List<String> letterCombinations(String digits) {
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String>ans=new ArrayList<>();
        phone(map,digits,ans,new StringBuilder(),0);
        return ans;
    }
    static void phone(String[] map,String s,List<String>ans,StringBuilder crr,int i){
        if(s.length()==0) return;
        if(crr.length()==s.length()){
            String re=new String(crr);
            ans.add(re);
            return;
        }
        for(int j=0;j<map[s.charAt(i) - '0'].length();j++){
            crr.append(map[s.charAt(i) - '0'].charAt(j));
            phone(map,s,ans,crr,i+1);
            crr.deleteCharAt(crr.length() - 1);
        }
    }
}