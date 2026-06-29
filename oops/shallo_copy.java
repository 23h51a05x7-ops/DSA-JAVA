package oops;

import java.util.ArrayList;

public class shallo_copy {
    public static void main(String[] args) {
        ArrayList<Integer>l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        ArrayList<Integer>l2=l;
        System.out.println(l);
        System.out.println(l2);
        l.add(100);
        System.out.println(l);
        l2.remove(2);
        System.out.println(l2);
    }
}
