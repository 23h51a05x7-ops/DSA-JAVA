package oops;

public class clone implements Cloneable{
    int a;
    String name;
    public clone(int a,String name){
        this.a=a;
        this.name=name;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}