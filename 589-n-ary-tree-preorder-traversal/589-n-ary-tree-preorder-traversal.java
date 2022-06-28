/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        solve(ans,root);
        return ans;
    }
    public void solve(List<Integer> ans,Node root){
        ans.add(root.val);
        for(Node x:root.children){
            solve(ans,x);
        }
        
    }
}