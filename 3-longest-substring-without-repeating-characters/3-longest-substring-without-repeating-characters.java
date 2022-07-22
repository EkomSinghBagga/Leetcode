class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,ans=0;
        Set<Character> set=new HashSet<>();
        while(j<s.length()){
            char ch=s.charAt(j);
            if(!set.contains(ch))
            {
                set.add(ch);j++;
                ans=Math.max(j-i,ans);
            }
            else{
                set.remove(s.charAt(i++));
            }
            
        }
        ans=Math.max(ans,j-i);
        return ans;
    }
}