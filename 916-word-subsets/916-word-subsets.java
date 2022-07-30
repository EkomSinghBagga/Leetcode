class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] f=new int[26];
        for(String w:words2){
            int[] f2=new int[26];
            for(char ch:w.toCharArray())
                f2[ch-'a']++;
            for(int i=0;i<26;i++){
                f[i]=Math.max(f[i],f2[i]);
            }
        }
        List<String> list=new ArrayList<>();
        for(String w:words1){
            boolean flag=true;
            int[] f1=new int[26];
            for(char ch:w.toCharArray()){
                f1[ch-'a']++;
            }
            for(int i=0;i<26;i++){
                if(f1[i]>=f[i])
                    continue;
                flag=false;
                break;
            }
            if(flag)
            list.add(w);
        }
        return list;
    }
}