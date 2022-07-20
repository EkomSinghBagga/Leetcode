class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int ones=0,zero=0;
        for(int i:students){
            if(i==0)
                zero++;
            else
                ones++;
        }
        for(int s:sandwiches){
            if(s==0){
                if(zero==0)
                    return ones;
                zero--;
            }
            else{
                if(ones==0)
                    return zero;
                ones--;
            }
        }
        return 0;
    }
}