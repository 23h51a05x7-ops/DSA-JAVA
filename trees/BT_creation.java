import java.util.*;
class binarytree{
    public class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
            this.right=null;
            this.left=null;
        }
    }
    Scanner sc=new Scanner(System.in);
    Node root;
    public void insert_root(){
        System.out.println("inter the root value: ");
        int value=sc.nextInt();
        root=new Node(value);
        insert(root);
    }
    public void insert(Node node){
        System.out.println("do you want to enter the left of the"+node.value);
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("enter the value of left node of"+node.value);
            int value=sc.nextInt();
            node.left=new Node(value);
            insert(node.left);
        }
        System.out.println("do you want to enter the rigth of the"+node.value);
        boolean right=sc.nextBoolean();
        if(right){
            System.out.println("enter the value of right node of"+node.value);
            int value=sc.nextInt();
            node.right=new Node(value);
            insert(node.right);
        }
    }
    public void display(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.value);
        display(node.left);
        display(node.right);
    }
    public static void main(String args[]){
        binarytree tree=new binarytree();
        tree.insert_root();
        tree.display(tree.root);
    }
}