class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int st=0,end=matrix.length-1,ind=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(matrix[mid][0]<=target){
                ind=mid;
                st=mid+1;
            }
            else
            {
                
                end=mid-1;
            }
        }
        if(ind==-1)
            return false;
        st=0;end=matrix[ind].length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(matrix[ind][mid]==target)
                return true;
            else if(matrix[ind][mid]<target)
                st=mid+1;
            else
                end=mid-1;
        }
        return false;
    }
    
}