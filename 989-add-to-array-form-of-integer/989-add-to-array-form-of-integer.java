class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans=new ArrayList<>();
        int carry=0;
        for(int i=num.length-1;i>=0;i--){
            int d=num[i]+k%10+carry;
            carry=d/10;
            d%=10;
            ans.add(d);
            k/=10;
        }
        while(k!=0){
            int d=carry+k%10;
            carry=d/10;
            d%=10;
            ans.add(d);
            k/=10;
        }
        if(carry!=0)
            ans.add(carry);
        Collections.reverse(ans);
        return ans;
    }
}