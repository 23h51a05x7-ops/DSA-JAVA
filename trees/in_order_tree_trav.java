//it is logic to traversal a tree of in order;
public void preorder(Node node){
    if(node==null){
        return;
    }
    preorder(node.left);
    System.out.println(node.value+" ");
    preorder(node.rigth);
}