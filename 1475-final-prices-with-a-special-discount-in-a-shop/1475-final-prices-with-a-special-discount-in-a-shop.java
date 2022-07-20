class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st=new Stack<>();
        int n=prices.length;
        st.push(prices[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty()&&prices[i]<st.peek()){
                st.pop();
            }
            if(st.isEmpty())
            {
                st.push(prices[i]);
                continue;
            }
            int x=st.peek();
            st.push(prices[i]);
            prices[i]-=x;
        }
        return prices;
    }
}