class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] f=new int[26];
        for(char ch:tasks)
            f[ch-'A']++;
        Arrays.sort(f);
        int max_val=f[25]-1;
        int idle=max_val*n;
        for(int i=24;i>=0;i--){
            idle-=Math.min(max_val,f[i]);
        }
        return idle>0?idle+tasks.length:tasks.length;
    }
}