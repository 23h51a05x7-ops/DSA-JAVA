package oops;

public class static_block_understanding {
    static int a=10;
    static int b;
    static{
        System.out.println("this is the sgatic block");
        b=a*5;
    }
    public static void main(String[] args) {
        System.out.println(static_block_understanding.a+" "+static_block_understanding.b);
        System.out.println(b);
        b+=3;
        System.out.println(b);
        if(a>5){
            b=b+100;
            System.out.println(b);
        }
        gift();
        System.out.println(b);
    }
    public static void gift(){
        b=1000;
        System.out.println(b);
    }
}
