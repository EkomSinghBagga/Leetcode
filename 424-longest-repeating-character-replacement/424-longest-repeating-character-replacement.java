class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int mostfreq=0,i=0,max=0;
        for(int j=0;j<s.length();j++){
            freq[s.charAt(j)-'A']++;
            mostfreq=Math.max(freq[s.charAt(j)-'A'],mostfreq);
            int letterToChange=j-i+1-mostfreq;
            if(letterToChange>k){
                freq[s.charAt(i)-'A']--;
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}