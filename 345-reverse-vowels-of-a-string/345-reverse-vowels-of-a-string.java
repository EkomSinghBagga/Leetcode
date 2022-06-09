class Solution {
    public String reverseVowels(String s) {
     int i=0,j=s.length()-1;
    char[] c=s.toCharArray();
    while(i<j){
        while(i<s.length()){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                break;
            }
            else
                i++;
        }
        while(j>=0){
            char ch=s.charAt(j);
            if(isVowel(ch))
                break;
            else
                j--;
        }
        if(i<j)
        {
            
            char t=c[i];
            c[i]=c[j];
            c[j]=t;
            
            i++;
            j--;
        }
    }
        return new String(c);
    }
    boolean isVowel(char y)
    {
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
            || y == 'u' || y == 'A' || y == 'E' || y == 'I'
            || y == 'O' || y == 'U')
            return true;
        else
            return false;
    }
}