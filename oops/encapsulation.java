package oops;

public class encapsulation {
    private int balance=1000;
    public encapsulation(){
    }
    public int getBalance(){
        return balance;
    }
    public void deposit(int num){
        if(num>0){
            balance+=num;
            System.out.println("Deposite successfull:"+num);
            System.out.println("total balance:"+balance);
        }
    }
    public void withdraw(int num){
        if(num>0&&balance>=num){
            balance-=num;
            System.out.println("withdraw successfull"+num);
            System.out.println("total balance:"+balance);
        }
        else{
            System.out.println("cannot withdraw the money:"+num);
        }
    }

}
