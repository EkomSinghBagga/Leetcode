class Solution {
    public int brokenCalc(int startValue, int target) {
        int ans=0;
        while(target>startValue){
            ans++;
            if(target%2!=0){
                target++;
            }
            else
                target/=2;
        }
        return startValue-target+ans;
    }
}