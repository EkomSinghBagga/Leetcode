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
    ArrayList<Integer> a=new ArrayList<>();
    public BSTIterator(TreeNode root) {
        inorder(a,root);
    }
    public void inorder(ArrayList<Integer> a,TreeNode root){
        if(root==null)
            return;
        inorder(a,root.left);
        a.add(root.val);
        inorder(a,root.right);
    }
    public int next() {
        if(hasNext())
        {
            int ans=a.get(0);
            a.remove(0);
            return ans;
        }
        return 0;
    }
    
    public boolean hasNext() {
    return a.size()!=0;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */