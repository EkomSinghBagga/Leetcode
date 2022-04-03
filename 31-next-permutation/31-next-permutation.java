class Solution {
    public void nextPermutation(int[] nums) {
 int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }
    public void swap(int[] nums,int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public void reverse(int[] nums,int left){
        int right=nums.length-1;
        while(left<right){
            int t=nums[left];
            nums[left++]=nums[right];
            nums[right--]=t;
        }
    }
}