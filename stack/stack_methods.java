import java.security.Signature;
import java.util.*;

import javax.swing.text.html.parser.Element;
class stack{
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the Stack");
        int n=sc.nextInt();
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            st.push(sc.nextInt());
        }
        System.out.println("Eneter elemt to search:");
        System.out.println(st.contains(sc.nextInt()));
        System.out.println("Size of the Stack is:"+st.size());
         System.out.println("Elements in the Stack are:");
        for(int i=0;i<n;i++){
            System.out.println(st.pop());
        }
    }
}