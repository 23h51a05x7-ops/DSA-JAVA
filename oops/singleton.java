package oops;

public class singleton {
    private static singleton obj;
    private singleton(){}
    public static singleton getInstance(){
        if(obj==null){
            obj=new singleton();
        }
        return obj;
    }
    public static void main(String[] args) {
        singleton obj=singleton.getInstance();
        singleton obj2=singleton.getInstance();
        System.out.println(obj==obj2);
    }
}
