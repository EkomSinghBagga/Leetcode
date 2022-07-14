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
class BSTIterator {
    List<Integer> ans;
    int ind;
    public BSTIterator(TreeNode root) {
        ans=new ArrayList<>();
       solve(root); 
       ind=0;
    }
    public void solve(TreeNode root){
        if(root==null) return ;
        if(root.left!=null){
            solve(root.left);
        }
        ans.add(root.val);
        if(root.right!=null)
            solve(root.right);
    }
    
    public int next() {
        return ans.get(ind++);
    }
    
    public boolean hasNext() {
        return ind<ans.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */