package oops.interface_understand;

public interface payment_method {
    int a=10;
    // void pay();
    // void refaund();
    // String bank_name();
    default void fun(){
        System.out.println("this is A's fun");
    }
    default void show(){
            fun();
    }
}
