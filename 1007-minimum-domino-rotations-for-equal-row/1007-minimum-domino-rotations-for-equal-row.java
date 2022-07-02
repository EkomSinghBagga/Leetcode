class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int[] countA=new int[7],countB=new int[7],same=new int[7];
        int n=tops.length;
        for(int i=0;i<n;i++){
            countA[tops[i]]++;
            countB[bottoms[i]]++;
            if(tops[i]==bottoms[i])
                same[tops[i]]++;
        }
        for(int i=1;i<7;i++){
            if(countA[i]+countB[i]-same[i]==n)
                return n-Math.max(countA[i],countB[i]);
        }
        return -1;
    }
}