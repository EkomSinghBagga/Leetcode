// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine().trim();
            Solution ob = new Solution();
            ArrayList<String> ans = new ArrayList<String>();
            ans = ob.permutation(S);
            
            for(int i=0;i<ans.size();i++){
                System.out.print("("+ans.get(i)+")");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution{
    
    ArrayList<String> permutation(String S){
        // Code Here
        ArrayList<String> ans=new ArrayList<>();
        
        solve(S.substring(1),S.charAt(0)+"",ans);
        return ans;
    }
    static void solve(String input,String output,ArrayList<String> ans){
        if(input.length()==0){
            // sb.append(s.charAt(ind));
            ans.add(output);
            return;
        }
       char ch=input.charAt(0);
       solve(input.substring(1),output+" "+ch,ans);
       solve(input.substring(1),output+ch,ans);
    }
    
}