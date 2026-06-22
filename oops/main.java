package oops;

public class main {
    public static void main(String[] args) {
        human mogili=new human(59, "mogili", 12000,true);
        human rama=new human(50, "rama", 9000,true);
        human.population+=1;
        System.out.println(human .population);
        human ra=new human(50, "rama", 9000,true);
        System.out.println(human .population);


    //    greating(); this will not work because it is a not static method do run this we have to create an object and use it
        main obj2=new main();
        obj2.fun2();
    }
    // public static void fun(){
    //     //    greating();           a non static method cannot be accessed by a static method

    //     main obj1=new main();
    //     obj1.greating();            // This works because we created a object here
    // }
    public void greating(){

        // fun();                       // but a static method can be accessed by the non static method
        System.out.println("greating");
    }
    public void fun2(){
        greating();
    }
}
