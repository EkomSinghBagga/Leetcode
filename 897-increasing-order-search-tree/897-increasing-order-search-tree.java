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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> in=new ArrayList<>();
        inorder(root,in);
        TreeNode ans=new TreeNode(in.get(0));
        TreeNode cur=ans;
        for(int i=1;i<in.size();i++){
            cur.right=new TreeNode(in.get(i));
            cur.left=null;
            cur=cur.right;
        }
        return ans;
    }
    public void inorder(TreeNode root,List<Integer> in){
        if(root==null)
            return;
        inorder(root.left,in);
        in.add(root.val);
        inorder(root.right,in);
    }
}