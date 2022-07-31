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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        int level=0;
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        // Deque<Integer> st=new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            int c=q.size();
            List<Integer> l=new ArrayList<>();
            
            for(int i=0;i<c;i++){
                TreeNode cur=q.poll();
                l.add(cur.val);
                if(cur.left!=null)
                    q.offer(cur.left);
                if(cur.right!=null)
                    q.offer(cur.right);
            }
            if(level%2==0)
                ans.add(l);
            else{
                Collections.reverse(l);
                ans.add(l);
            }
            level++;
        }
        return ans;
    }
}