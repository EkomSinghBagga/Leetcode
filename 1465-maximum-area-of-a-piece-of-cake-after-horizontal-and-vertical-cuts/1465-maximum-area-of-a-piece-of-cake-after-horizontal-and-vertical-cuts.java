class Solution {
    public int maxArea(int h, int v, int[] hCuts, int[] vCuts) {
        Arrays.sort(hCuts);
        Arrays.sort(vCuts);
        long maxh=Math.max(hCuts[0],h-hCuts[hCuts.length-1]);
        long maxV=Math.max(vCuts[0],v-vCuts[vCuts.length-1]);
        for(int i=1;i<hCuts.length;i++){
            maxh=Math.max(maxh,hCuts[i]-hCuts[i-1]);
        }
        for(int i=1;i<vCuts.length;i++){
            maxV=Math.max(maxV,vCuts[i]-vCuts[i-1]);
        }
        return (int)((maxh*maxV)%1000000007);
    }
}