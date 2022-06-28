class Solution {
    public int minDeletions(String s) {
      int[] f=new int[26];
      for(char ch:s.toCharArray()){
          f[ch-'a']++;
      }
        Set<Integer> set=new HashSet<>();
        int ans=0;
        for(int i=0;i<26;i++){
            while(f[i]>0&&set.contains(f[i]))
            {
                f[i]--;
                ans++;
            }
            set.add(f[i]);
        }
        return ans;
    }
}