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
    public int deepestLeavesSum(TreeNode root) {
      int i,res=0;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            // System.out.println(res);
            for(i=q.size()-1,res=0;i>=0;--i){
                TreeNode node=q.poll();
                res+=node.val;
                if(node.right!=null)
                    q.offer(node.right);
                if(node.left!=null)
                    q.offer(node.left);
            }
        }
        return res;
    }
}