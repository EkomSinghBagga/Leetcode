class Solution {
    public int lengthOfLongestSubstring(String s) {
     int i=0,j=0,ans=0;
        Set<Character> set=new HashSet<>();
        while(j<s.length()){
            while(set.contains(s.charAt(j)))
                set.remove(s.charAt(i++));
            set.add(s.charAt(j++));
            ans=Math.max(ans,j-i);
        }
        return ans;
    }
}