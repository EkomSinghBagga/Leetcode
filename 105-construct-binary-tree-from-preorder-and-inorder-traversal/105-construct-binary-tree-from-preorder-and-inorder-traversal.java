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
    int preindex=0;
    Map<Integer,Integer> inindex;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       inindex=new HashMap<>();
        for(int i=0;i<inorder.length;++i){
            inindex.put(inorder[i],i);
        }
        return solve(preorder,0,preorder.length-1);
    }
    public TreeNode solve(int[] pre,int st,int end){
        if(st>end) return null;
       int val=pre[preindex++];
        TreeNode root=new TreeNode(val);
        root.left=solve(pre,st,inindex.get(val)-1);
        root.right=solve(pre,inindex.get(val)+1,end);
        return root;
    }
}