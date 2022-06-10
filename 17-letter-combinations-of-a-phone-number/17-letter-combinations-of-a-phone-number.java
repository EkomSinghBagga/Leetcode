class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.equals(""))
            return ans;
        String[] map={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(map,ans,digits,"");
        return ans;
    }
    public void backtrack(String[] map,List<String> ans,String digits,String cur){
        if(cur.length()==digits.length()){
            ans.add(cur);
            return;
        }
        int i=cur.length();
        int digit=digits.charAt(i)-'0';
        for(char ch:map[digit].toCharArray()){
            backtrack(map,ans,digits,cur+ch);
        }
    }
}