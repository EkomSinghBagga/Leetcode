class Solution {
    public List<String> buildArray(int[] target, int n)         {
        List<String> ans=new ArrayList<>();
        int ti=0,i=1;
        while(i<=n&&ti<target.length){
            if(i==target[ti])
              {     
                ans.add("Push");
                i++;
                ti++;
                }
           else{
               ans.add("Push");
               ans.add("Pop");
               i++;
           }
        }
    return ans;
    }
}