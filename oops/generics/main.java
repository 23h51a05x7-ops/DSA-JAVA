package oops.generics;

public class main {
    public static void main(String[] args) {
        student s1=new student(80,"Pavan");
        student s2=new student(90, "vignes");
        if(s1.compareTo(s2)>0){
            System.out.println("s1 is ");
        } 
    }
}
