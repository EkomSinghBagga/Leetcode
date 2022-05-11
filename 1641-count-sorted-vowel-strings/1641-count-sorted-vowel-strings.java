class Solution {
    public int countVowelStrings(int n) {
        int a=1,e=1,i=1,o=1,u=1;
        for(int j=1;j<n;j++){
            a=a+e+i+o+u;
            e=e+u+i+o;
            i+=u+o;
            o+=u;
            
        }
        return a+e+i+u+o;
    }
}