package strings;

public class comprasion {
    public static void main(String[] args) {
        String a="pavan";
        String b="pavan";
        a.charAt(2)='k';           //it does not work bcz it is a immutable we cannot modify
        System.out.println(b);
    }
}
