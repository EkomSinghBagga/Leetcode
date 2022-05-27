class Solution {
    public int maximumProduct(int[] nums) {
     Arrays.sort(nums);
    int a=nums[nums.length-1],b=nums[nums.length-2],c=nums[nums.length-3];
    int x=nums[0],y=nums[1];
    return Math.max(a*b*c,a*x*y);
    }
}