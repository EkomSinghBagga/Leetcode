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
    public void inorder(TreeNode root,ArrayList<Integer> a){
        if(root==null)
            return;
        inorder(root.left,a);
        a.add(root.val);
        inorder(root.right,a);
    }
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)
            return root;
      ArrayList<Integer> a=new ArrayList<>();
      inorder(root,a);
        // for(int i:a)
        //     System.out.print(i);
       TreeNode ans=new TreeNode(a.get(0)),dummy=ans;
        
        ans.left=null;
        for(int i=1;i<a.size();i++){
            ans.right=new TreeNode(a.get(i));
            ans.left=null;
            ans=ans.right;
        }
        return dummy;
    }
}