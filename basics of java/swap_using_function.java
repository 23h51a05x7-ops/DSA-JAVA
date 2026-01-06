public class swap_using_function {

public static void main(String[] args) {
    int a=10;
    int b=20;
    sum(a,b);
    System.out.println(a+" "+b);
}
static void sum(int n1,int n2){
    int temp=n1;
    n1=n2;
    n2=temp;
}
}