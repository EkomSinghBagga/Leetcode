/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)
            return null;
        Map<Integer,Node> mp=new HashMap<>();
        dfs(node,mp);
        return mp.get(node.val);
    }
    public void dfs(Node node,Map<Integer,Node> mp){
        Node x=new Node(node.val,new ArrayList<Node>());
        mp.put(node.val,x);
        for(Node i:node.neighbors){
            if(!mp.containsKey(i.val))
                dfs(i,mp);
            x.neighbors.add(mp.get(i.val));
        }
    }
}