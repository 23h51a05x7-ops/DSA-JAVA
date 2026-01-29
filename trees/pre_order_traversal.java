//it is logic to traversal a tree of pre orer;
public void preorder(Node node){
    if(node==null){
        return;
    }
    System.out.println(node.value+" ");
    preorder(node.left);
    preorder(node.rigth);
}