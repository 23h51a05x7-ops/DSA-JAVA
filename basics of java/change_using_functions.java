import java.util.Arrays;

public class change_using_functions {
    public static void main(String[] args) {
    int a[]={10,20,30,40};
    sum(a);
    System.out.println(Arrays.toString(a));
}
static void sum(int []n){
    n[0]=99;
}
}
