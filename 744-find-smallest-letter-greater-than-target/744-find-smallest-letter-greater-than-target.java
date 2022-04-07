class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
      int st=0,end=letters.length-1,ans=0;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(letters[mid]>target){
                ans=mid;
                end=mid-1;
            }
            else
                st=mid+1;
        }
        return letters[ans];
    }
}