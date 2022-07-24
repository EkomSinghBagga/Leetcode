class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        boolean ans=false;
        for(int i=0;i<m;i++){
              // System.out.println(matrix[i][0]+" "+matrix[i][n-1]);
             if(matrix[i][0]>target)
                break;
            if(matrix[i][0]<=target&&matrix[i][n-1]>=target){
               
                ans=ans||binarySearch(matrix[i],target);
                  if(ans==true)
                return true;
           
            }
           
            
            
          
        }
        return ans;
    }
    public boolean binarySearch(int[] matrix,int target){
        int st=0,end=matrix.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(matrix[mid]==target)
                return true;
            else if(matrix[mid]<target)
                st=mid+1;
            else
                end=mid-1;
        }
        return false;
    }
}