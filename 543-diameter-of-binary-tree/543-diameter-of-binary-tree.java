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
    int res=0;
    public int diameterOfBinaryTree(TreeNode root) {
      findHeight(root);
      return res-1;
        
    }
    public int findHeight(TreeNode root){
        if(root==null)
            return 0;
        int lh=findHeight(root.left);
        int rh=findHeight(root.right);
        res=Math.max(res,1+lh+rh);
        return 1+Math.max(lh,rh);
    }
    
}