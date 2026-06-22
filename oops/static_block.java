package oops;

public class static_block {
    static int a=10;
    static int b;
    static{
        System.out.println("i will load first");
        b=a*5;
    }
    public static void main(String[] args) {
        System.out.println(b);
    }
}
