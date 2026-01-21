class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode dummynode=new ListNode(0);
        dummynode.next=head;
        ListNode temp=dummynode;
        while(temp.next!=null && temp.next.next!=null){
            ListNode first=temp.next;
            ListNode second=first.next;
            ListNode nextpart=second.next;
            first.next=null;
            second.next=null;
            second.next=first;
            temp.next=second;
            first.next=nextpart;
            temp=first;
        }
        return dummynode.next;
    }
}