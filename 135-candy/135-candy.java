class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int[] prefix=new int[n],suffix=new int[n];
        Arrays.fill(prefix,1);
        Arrays.fill(suffix,1);
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1])
                prefix[i]=prefix[i-1]+1;
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1])
                suffix[i]=suffix[i+1]+1;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.max(prefix[i],suffix[i]);
        }
        return ans;
    }
}