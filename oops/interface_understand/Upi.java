package oops.interface_understand;

public class Upi implements payment_method{
    public void pay(){  
        System.out.println("payment done with the upi");
    }
    public void refaund(){
        System.out.println("money has funded");
    }
    public String bank_name(){
        System.out.println("state bank");
        return "iob";
    }
}
