package oops;

public class main_clone {
    public static void main(String[] args) throws CloneNotSupportedException{
        clone s1=new clone(10, "pavan");
        clone s2=(clone)s1.clone();
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
