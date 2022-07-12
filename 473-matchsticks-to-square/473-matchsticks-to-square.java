class Solution {
    public boolean makesquare(int[] matchsticks) {
        
       int sum=0;
        for(int m:matchsticks){
            sum+=m;
        }
        if(sum%4!=0) return false;
        int side=sum/4;
        Arrays.sort(matchsticks);
        return solve(matchsticks,matchsticks.length-1,0,0,0,0,side);
        
    }
    public boolean solve(int[] nums,int i,int top,int down,int left,int right,int target){

        if(top==target&&down==target&&left==target&&right==target)
            return true;
        if(i<0)
            return false;
        if(top>target||down>target||left>target||right>target) return false;
        
        return solve(nums,i-1,top+nums[i],down,left,right,target)
        ||solve(nums,i-1,top,down+nums[i],left,right,target)
        ||solve(nums,i-1,top,down,left+nums[i],right,target)
        ||solve(nums,i-1,top,down,left,right+nums[i],target);

    }
}