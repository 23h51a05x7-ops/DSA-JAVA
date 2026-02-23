public class wiggle_sub_seq {
        static int wiggleMaxLength(int[] nums) {
            char arr[]=new char[nums.length];
            for(int i=1;i<nums.length;i++){
                int n=nums[i]-nums[i-1];
                if(n<0){
                    arr[i-1]='d';
                }
                if(n>0){
                    arr[i-1]='u';
                }
                if(n==0){
                    arr[i-1]='e';
                }
            }
            int c=0;
            char prvs='x';
            for(int i=0;i<arr.length;i++){
                if(arr[i]=='e'){
                    continue;
                }
                if(arr[i]!=prvs && prvs!='x'){
                    prvs=arr[i];
                    c++;
                }
                if(prvs=='x'){
                    prvs=arr[i];
                    c++;
                }
            }
            return c;
        }
        public static void main(String[] args) {
            int arr[]={1,7,4,9,2,5};
            System.out.println(wiggleMaxLength(arr));
    }  
}
