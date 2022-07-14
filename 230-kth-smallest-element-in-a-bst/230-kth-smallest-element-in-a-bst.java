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
    ArrayList<Integer> inorder;
    public int kthSmallest(TreeNode root, int k) {
        inorder=new ArrayList<>();
        solve(root);
        return inorder.get(k-1);
    }
    public void solve(TreeNode root){
        if(root==null) return ;

        if(root.left!=null)
            solve(root.left);
        inorder.add(root.val);
        if(root.right!=null)
            solve(root.right);
    }
}