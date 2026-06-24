package oops;

public class method_overloading {
    public int sum(int a ,int b){
        return a+b;
    }
    final public int sum(int a,int b,int c){  // overload methods can be final and accessble
        return a+b+c;
    }
    public double sum(double a,int b,int c){
        return a+b;
    }
    public void help(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        method_overloading obj1=new method_overloading();
    //    System.out.println(obj1.sum(5, 8));
        method_overloading obj=new method_overloading();
    //    obj.sum(5,4);
        method_hiding obj2=new Child();     //this os overhididng
        obj2.show();
    }
}
