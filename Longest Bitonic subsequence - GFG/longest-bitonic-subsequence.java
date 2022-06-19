// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] s1 = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < s1.length; i++)
                nums[i] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int ans = ob.LongestBitonicSequence(nums);
            System.out.println(ans);           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestBitonicSequence(int[] arr)
    {
        // Code here
        int n=arr.length;
        int[] ldp=new int[n];
        int[] rdp=new int[n];
        Arrays.fill(ldp,1);
        Arrays.fill(rdp,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i])
                    ldp[i]=Math.max(ldp[i],ldp[j]+1);
            }
        }
        for(int i=n-2;i>=0;i--){
            for(int j=n-1;j>i;j--){
                if(arr[i]>arr[j])
                rdp[i]=Math.max(rdp[i],rdp[j]+1);
            }
        }
        int ans=1;
        for(int i=0;i<n;i++){
        

          
                ans=Math.max(ans,ldp[i]+rdp[i]-1);
        }
        return ans;
    }
}