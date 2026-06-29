package oops.generics;

public class student implements Comparable<student>{
    int marks;
    String name;
    public student(int marks,String name){
        this.marks=marks;
        this.name=name;
    }
    @Override
    public int compareTo(student other){
        return this.marks-other.marks;
    }
}
