package strings;
import java.util.*;
public class longest_prefix_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(sc.next());
        }
        Collections.sort(l);
        int i=0;
        int j=0;
        while(i<l.get(0).length()&&j<l.get(l.size()-1).length()){
            if(l.get(0).charAt(i)!=l.get(l.size()-1).charAt(j)){
                break;
            }
            i++;
            j++;
        }
        System.out.println(l.get(0).substring(0,i));
    }
}
