package oops;
public class studentclass {
    int roll;
    String name;
    float marks;
    public studentclass(){}
    public void greeting(){
        System.out.println("hello my name is "+this.name);
    }
    public void change(String name){
        this.name=name;
    }
    public studentclass(studentclass other){
        this.name=other.name;
        this.roll=other.roll;
        this.marks=other.marks;
    }
    public studentclass(int n,String s,float m){
        this.roll=n;
        this.name=s;
        this.marks=m;
    }
    public studentclass(String s){
        this.name=s;
    }
}
