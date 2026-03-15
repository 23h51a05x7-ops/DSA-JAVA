package src.Arrays;

import java.util.Arrays;

public class boats_to_save_peop {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0;
        int r=people.length-1;
        int b=0;
        while(l<=r){
            if(people[l]+people[r]<=limit){
                l++;
                r--;
            }
            else{
                r--;
            }
            b++;
        }
        return b;
    }
    public static void main(String[] args) {
        int peop[]={3,2,2,1};
        int limit=3;
        System.out.println(numRescueBoats(peop, limit));
    }
}
