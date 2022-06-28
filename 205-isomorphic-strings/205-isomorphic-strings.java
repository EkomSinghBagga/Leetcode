class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> mp=new HashMap<>();
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                if(mp.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }
            else
                mp.put(s.charAt(i),t.charAt(i));
        }
        Map<Character,Character> mp2=new HashMap<>();
         for(int i=0;i<s.length();i++){
            if(mp2.containsKey(t.charAt(i))){
                if(mp2.get(t.charAt(i))!=s.charAt(i))
                    return false;
            }
            else
                mp2.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }
}