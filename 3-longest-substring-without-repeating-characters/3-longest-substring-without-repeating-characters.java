class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int i=0,j=0,max=0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
            }
            else{
                max=Math.max(j-i,max);
                set.remove(s.charAt(i++));
            }
        }
        max=Math.max(j-i,max);
        return max;
    }
}