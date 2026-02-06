// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Main{
    public static void main(String args[]){
        ll l=new ll();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.dis();
    }
}
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class ll{
    Node head;
    public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next = node;
        }
    }
    public void dis(){
            Node temp=head;
            System.out.print("head->");
            while(temp!=null){
                System.out.print(temp.val+"->");
                temp=temp.next;
            }
            System.out.print("Null");
        }
}
