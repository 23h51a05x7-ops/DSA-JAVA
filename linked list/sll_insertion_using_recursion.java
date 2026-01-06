class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}
class sll{
    Node head;
    public  void insert(int index,int value){
        if(index==0){
            Node node=new Node(value);
            node.next=head;
            head=node;
            return;
        }
        insertrev(head,index,value);
    }
    public void insertrev(Node curr,int index,int value){
        if(index==1){
            Node node=new Node(value);
            node.next=curr.next;
            curr.next=node;
            return;
        }
        insertrev(curr.next,index-1,value);
    }
}