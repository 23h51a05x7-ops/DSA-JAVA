// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node{
    int val;
    Node left;
    Node right;
    int heigth;
    public Node(int val){
        this.val=val;
    }
}
class bst{
    Node root;
    public void insert(int num){
    root =insert(root,num);
    }
    private Node insert(Node node,int num){
        if(node ==null){
            node=new Node(num);
            return node;
        }
        if(num<node.val){
            node.left=insert(node.left,num);
        }
        if(num>node.val){
            node.right=insert(node.right,num);
        }
        return node;
    }
    public int height() {
    return height(root);
    }

    private int height(Node node){
    if(node==null){
        return -1;
    }
    int leftHeight=height(node.left);
    int rightHeight=height(node.right);
    return Math.max(leftHeight, rightHeight) + 1;
    }

    public void trave(){
        inorder(root);
    }
    public void inorder(Node node){
        //is should print the node values in sorted order
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.print(node.val+" ");
        inorder(node.right);
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("welcome");
        bst tree=new bst();
        int arr[]={15,12,19,10,18,7,6};
        for(int i=0;i<arr.length;i++){
            tree.insert(arr[i]);
        }
        System.out.println("Tree craeted successfully");
        System.out.println("The traversal in-order of the tree(BST) is:");
        tree.trave();
        System.out.println("\nheight of the tree is :"+tree.height());
    }
}