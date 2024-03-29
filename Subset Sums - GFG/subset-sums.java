// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}
// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        backtrack(ans,arr,N,0,0);
        return ans;
    }
    public void backtrack(ArrayList<Integer>ans, ArrayList<Integer> arr,int n,int index,int sum){
        if(index==n)
        {
            ans.add(sum);
            return;
        }
        sum+=arr.get(index);
        backtrack(ans,arr,n,index+1,sum);
        sum-=arr.get(index);
        backtrack(ans,arr,n,index+1,sum);
    }
}