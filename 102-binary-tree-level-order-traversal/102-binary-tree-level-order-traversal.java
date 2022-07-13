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
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> cur=new ArrayList<>();
            int size=q.size();
            while(size-->0){
                TreeNode x=q.poll();
                cur.add(x.val);
                if(x.left!=null)
                    q.offer(x.left);
                if(x.right!=null)
                    q.offer(x.right);
            }
            ans.add(cur);
        }
        return ans;
    }
}