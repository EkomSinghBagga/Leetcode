class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
       Stack<Integer> st1=new Stack<>();
        int[] ps=new int[n];
        for(int i=0;i<n;i++){
            while(!st1.isEmpty()&&heights[st1.peek()]>=heights[i]){
                st1.pop();
            }
            if(st1.isEmpty())
                ps[i]=-1;
            else
                ps[i]=st1.peek();
            st1.push(i);
        }
        Stack<Integer> st2=new Stack<>();
        int[] ns=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st2.isEmpty()&&heights[st2.peek()]>=heights[i]){
                st2.pop();
            }
            if(st2.isEmpty())
                ns[i]=n;
            else
                ns[i]=st2.peek();
            st2.push(i);
        }
        int max=0;
        for(int i=0;i<n;i++){
            int cur=heights[i];
            cur+=(i-ps[i]-1)*heights[i];
            cur+=(ns[i]-i-1)*heights[i];
            max=Math.max(max,cur);
        }
        return max;
    }
}