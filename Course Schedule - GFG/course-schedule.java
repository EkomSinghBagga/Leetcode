// { Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            String st[] = read.readLine().trim().split("\\s+");
            int n = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);

            for (int i = 0; i < n; i++)
                list.add(i, new ArrayList<Integer>());

            ArrayList<ArrayList<Integer>> prerequisites = new ArrayList<>();
            for (int i = 1; i <= m; i++) {
                String s[] = read.readLine().trim().split("\\s+");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                list.get(v).add(u);
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(u);
                pair.add(v);
                prerequisites.add(pair);
            }

            int[] res = new Solution().findOrder(n, m, prerequisites);
            
            if(res.length==0)
                System.out.println("No Ordering Possible");
            else
            {
                if (check(list, n, res) == true)
                    System.out.println("1");
                else
                    System.out.println("0");
            }
        }
    }
    static boolean check(ArrayList<ArrayList<Integer>> list, int V, int[] res) {
        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res[i]] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : list.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites) 
    {
        // add your code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        createGraph(adj,n,prerequisites);
        int[] indegree=new int[n];
        // for(int i=0;i<n;i++){
        //     for(int it:adj.get(i)){
        //         indegree[it]++;
        //     }
        // }
        for(ArrayList<Integer> it:prerequisites){
            indegree[it.get(0)]++;
        }
        Queue<Integer> q=new LinkedList<>();
        int ind=0;
        int[] topo=new int[n];
        for(int i=0;i<n;i++){
            if(indegree[i]==0)
            q.add(i);
        }
    
    while(!q.isEmpty()){
        int node=q.poll();
        topo[ind++]=node;
        for(int it:adj.get(node)){
            indegree[it]--;
            if(indegree[it]==0)
            {
                q.add(it);
            }
        }
    }
    if(ind==n)
    return topo;
    return new int[0];
}
    static void createGraph(ArrayList<ArrayList<Integer>> adj,int n,ArrayList<ArrayList<Integer>> edge){
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(ArrayList<Integer> it:edge){
            int u=it.get(0),v=it.get(1);
            adj.get(v).add(u);
        }
    }
}