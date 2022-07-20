class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& a) {
        stack<int> s;
        int n = a.size();
        vector<int> ans(n,0);
        for(int i = n-1; i >= 0; i--) {
            while(!s.empty() and a[s.top()] <= a[i]) s.pop();
            ans[i] = (s.empty() ? 0 : s.top() - i);
            s.push(i);
        }
        return ans;
    }
};