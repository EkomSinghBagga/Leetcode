class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int[] x=new int[m+n];int c=0;
    for(int i1=0,i2=0;i1<m||i2<n;c++){
        if(i1<m&&i2<n){
            if(nums1[i1]<nums2[i2]){
                x[c]=nums1[i1++];
            }
            else{
                x[c]=nums2[i2++];
            }
        }
        else if(i1<m){
            x[c]=nums1[i1++];
        }
        else{
            x[c]=nums2[i2++];
        }
    }
        for(c=0;c<m+n;c++){
            nums1[c]=x[c];
        }
    }
}