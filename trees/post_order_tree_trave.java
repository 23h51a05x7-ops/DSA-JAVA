//it is logic to traversal a tree of post orer;
public void preorder(Node node){
    if(node==null){
        return;
    }
    preorder(node.left);
    preorder(node.rigth);
    System.out.println(node.value+" ");
}