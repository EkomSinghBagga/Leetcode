class Solution {
    public int countVowelStrings(int n) {
        int a=1,e=1,o=1,u=1,i=1;
        for(int j=0;j<n-1;j++){
            a=a+e+o+u+i;
            e=e+i+o+u;
            i=i+o+u;
            o+=u;
            u=u;
        }
        return a+e+i+o+u;
    }
}