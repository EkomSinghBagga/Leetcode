class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new  ArrayList<>();
        backtrack(s,ans,new ArrayList<>(),0);
        return ans;
    }
    public void backtrack(String s,List<List<String>> ans,List<String> l,int index){
        if(index>=s.length()){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPallindrome(s,index,i)){
                l.add(s.substring(index,i+1));
                backtrack(s,ans,l,i+1);
                l.remove(l.size()-1);
            }
        }
    }
    public boolean isPallindrome(String s,int left,int right){
    while(left<right){
        if(s.charAt(left++)!=s.charAt(right--))
            return false;
    }
    return true;
    }
}