class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans=new ArrayList<>();
        int max=-1,prev=-1;
        int[] f=new int[26];
        for(char ch:s.toCharArray()){
            f[ch-'a']++;
        }
       for(int i=0;i<s.length();i++){
           if(max<i&&f[s.charAt(i)-'a']==1)
           {
               ans.add(i-prev);
               prev=i;
               
           }
          if(i==max)
            { 
              ans.add(max-prev);
              prev=max;
            }
           max=Math.max(max,s.lastIndexOf(s.charAt(i)));
       } 
        return ans;
    }
}