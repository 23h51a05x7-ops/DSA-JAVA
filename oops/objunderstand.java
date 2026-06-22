package oops;

import java.util.Arrays;

public class objunderstand {
    public static void main(String[] args) {
        studentclass student[]=new studentclass[5];
        studentclass pavan=new studentclass();//this will work bcz we give a constructor with no arguments
        studentclass pa=new studentclass(20,"cosdv",90);
        pavan.name="kogila Pavan Kuamr";
        pavan.change("k.Pa1 kumar");
        pavan.greeting();
        studentclass s1=new studentclass(pavan);
        System.out.println(s1.name);
        studentclass one=new studentclass();
        one.name="some thing";
        studentclass two=one;
        System.out.println(two.name);
        two.name="some thing 2";
        System.out.println(two.name);
        System.out.println(one.name);
    }
}
