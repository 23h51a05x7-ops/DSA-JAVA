public class overloading {
    public static void main(String[] args) {
        fun(20);
        fun("pavan"); // we can use the more than two integer here but not the single int or we can use the another
    }
    static void fun(int n){
System.out.println(n);
    }
    static void fun(String name){
System.out.println(name);
    }
}
