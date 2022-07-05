class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        int[] f=new int[26];
        for(char ch:p.toCharArray())
            f[ch-'a']++;
        while(j<s.length()){
            f[s.charAt(j++)-'a']--;
            if(j-i==p.length())
            {
                int k;
                for(k=0;k<26;k++){
                    if(f[k]!=0)
                        break;
                }
                if(k==26)
                    ans.add(i);
                f[s.charAt(i++)-'a']++;
            }
        }
        return ans;
    }
}