class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(st.isEmpty())
                st.push(ch);
            else {
                char c=st.peek();
                int x=c,y=ch;
                if(x-32==y||x==y-32)
                    st.pop();
                else
                    st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:st){
            sb.append(ch);
        }
        return sb.toString();
    }
}