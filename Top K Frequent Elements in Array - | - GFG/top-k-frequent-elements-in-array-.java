// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(s[i + 1]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[] ans = obj.topK(nums, k);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static class Pair{
        int key,val;
        Pair(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    public int[] topK(int[] nums, int k) {
        // Code here
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>(new Comp());
        for(int key:mp.keySet()){
            pq.offer(new Pair(key,mp.get(key)));
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll().key;
        }
        return ans;
    }
     class Comp implements Comparator<Pair>{
        public int compare(Pair m1,Pair m2){
           if(m1.val!=m2.val){
               return m2.val-m1.val;
              
           }
           else
           return m2.key-m1.key;
        }
    }

}
   