package oops;

public class inner_class {
    static class test{
        static String name;
        public test(String name){
            this.name=name;
        }
    }
    public static void main(String[] args) {
        test obj1=new test("kogila");
        test obj2=new test("shirisha");
        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
