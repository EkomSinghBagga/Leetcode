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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return solve(root.left,root.right);
    }
    public boolean solve(TreeNode left,TreeNode right){
        if(right==null&&left==null) return true;
        if(right==null||left==null) return false;
        return right.val==left.val&&solve(left.right,right.left)&&solve(left.left,right.right);
    }
}