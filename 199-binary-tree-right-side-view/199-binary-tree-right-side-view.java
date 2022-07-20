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
 Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode cur=q.poll();
                if(i==0)
                ans.add(cur.val);
                if(cur.right!=null){
                    q.offer(cur.right);
                }
                if(cur.left!=null)
                    q.offer(cur.left);
            }
        }
        return ans;
    }
}