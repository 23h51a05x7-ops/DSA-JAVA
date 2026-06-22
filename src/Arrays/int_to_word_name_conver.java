package src.Arrays;

import java.util.*;
public class int_to_word_name_conver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String>l=new ArrayList<>();
        HashMap<Integer,String>m=new HashMap<>();
        m.put(0,"zero");
        m.put(1,"one");
        m.put(2,"two");
        m.put(3,"three");
        m.put(4,"four");
        m.put(5,"five");
        m.put(6,"six");
        m.put(7,"seven");
        m.put(8,"eight");
        m.put(9,"nine");
        HashMap<Integer,String>m1=new HashMap<>();
        m1.put(0,"");
        m1.put(1,"hundred");
        m1.put(2,"thousnad");
        int j=0;
        while(n>0){
            if(m.containsKey(n%10)){
                l.add(0,m1.get(j));
                l.add(0,m.get(n%10));
                j++;
            }
            n=n/10;
        }
        System.out.println(l);
    }
}
