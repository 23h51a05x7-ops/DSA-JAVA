package oops;

public class understanding_encapsulation {
    public static void main(String[] args) {
        encapsulation a=new encapsulation();
        System.out.println("Balanace:"+a.getBalance());
        a.deposit(500);
        a.withdraw(1000);
        System.out.println(a.getBalance());
    }
}
