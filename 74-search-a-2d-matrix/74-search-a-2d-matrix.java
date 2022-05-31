class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int ans=-1,st=0,end=matrix.length-1; 
        while(st<=end){
            int mid=st+(end-st)/2;
            if(matrix[mid][0]==target)
                return true;
            else if(matrix[mid][0]<target){
                st=mid+1;
                ans=mid;
            }
            else
                end=mid-1;
        }
        if(ans==-1)
            return false;
        st=0;end=matrix[ans].length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(matrix[ans][mid]==target)
                return true;
            else if(matrix[ans][mid]<target)
                st=mid+1;
            else
                end=mid-1;
        }
        return false;
    }
}