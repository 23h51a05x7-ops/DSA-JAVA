package oops;

import java.util.ArrayList;
import java.util.List;

public class final_keyword {
    public static void main(String[] args) {
        final int a=10;
    //  a=20;this ln work
        System.out.println(a);  //get an error
        final List<Integer>l=new ArrayList<>();
        l.add(1);
        System.out.println(l);
        l.remove(l.size()-1);
    //  List<Integer>l=l2; //this wont work
        l.add(2);
        l.add(3);
        final studentclass st3=new studentclass();
    //  studentclass st3=new studentclass(); this is not work
        final studentclass check=new studentclass("find");
        studentclass check2=check;
        check2.name="bsdjvbi";
    }
}
