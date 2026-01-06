public class shadowing {
    static int x=100;
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        x=40;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
