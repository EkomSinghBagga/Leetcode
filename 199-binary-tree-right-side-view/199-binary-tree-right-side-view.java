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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        solve(root,ans,0);
        return ans;
    }
    public void solve(TreeNode root,List<Integer> ans,int curdepth){
        if(root==null)
            return ;
        if(ans.size()==curdepth)
            ans.add(root.val);
        solve(root.right,ans,curdepth+1);
        solve(root.left,ans,curdepth+1);
    }
}