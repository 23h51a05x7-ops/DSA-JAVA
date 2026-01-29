/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ll=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
       if(root==null) return ll;
       q.add(root);
       while(!q.isEmpty()){
        int size=q.size();
    List<Integer> l=new LinkedList<>();
        for(int i=0;i<size;i++){
        TreeNode cr=q.poll();
        l.add(cr.val);
        if(cr.left!=null) q.add(cr.left);
        if(cr.right!=null) q.add(cr.right);
       }
       ll.add(l);
       }
       return ll;
    }
}