package oops;

public class method_hiding {
    static void show() {
        System.out.println("Parent");
    }
}
class Child extends method_hiding{
    static void show() {
        System.out.println("Child");
    }
}
