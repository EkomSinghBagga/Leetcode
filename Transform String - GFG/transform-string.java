// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transform (A, B));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    int transform (String A, String B)
    {
        // code here
        int n1=A.length(),n2=B.length();
        if(n1!=n2)
        return -1;
        int[] f=new int[256];
        for(int i=0;i<n1;i++){
            f[A.charAt(i)]++;
            f[B.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(f[i]!=0)
            return -1;
        }
        int ans=0,i=n1-1,j=n1-1;
        while(i>=0){
            if(A.charAt(i)!=B.charAt(j))
            ans++;
            else
            j--;
            i--;
        }
        return ans;
    }
}