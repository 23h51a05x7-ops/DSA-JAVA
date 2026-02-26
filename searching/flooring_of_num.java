package searching;

public class flooring_of_num {
    public static void main(String[] args) {
        int arr[]={1,2,5,9,14,16,18};
        int cellingof=10;
        int s=0;
        int e=arr.length-1;
        System.out.println("hello");
        while(s<=e){
            int mid=(s+(e-s))/2;
            if(arr[mid]==cellingof){
                System.out.println(arr[mid]);
            }
            else if(arr[mid]>cellingof){
                e=mid-1;
            }
           else if(arr[mid]<cellingof){
                s=mid+1;
            } 
        }
        System.out.println(arr[e]);
        System.out.println("hi");
    }
}
