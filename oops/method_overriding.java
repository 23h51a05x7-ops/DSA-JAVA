package oops;

public class method_overriding extends method_overloading{
    @Override
    final public int sum(int a,int b){
        return a+b;
    }
    @Override
    public void help(){
        System.out.println("hello");
    }
}
