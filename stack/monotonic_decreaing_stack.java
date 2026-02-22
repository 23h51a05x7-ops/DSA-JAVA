import java.util.*;
public class monotonic_decreaing_stack {
    //next smallest element for the array arr[];
    public static void main(String[] args) {
        int arr[]={7,4,76,34,6,332,65};
        Stack<Integer>st=new Stack<>();
        int res[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while (!st.isEmpty() && st.peek()>=arr[i]) {
                st.pop();
            }
            if(!st.isEmpty()){
                res[i]=st.peek();
            }
            else{
                res[i]=-1;
            }
            st.push(arr[i]);
        }
            System.out.print(Arrays.toString(res));
    }
}
