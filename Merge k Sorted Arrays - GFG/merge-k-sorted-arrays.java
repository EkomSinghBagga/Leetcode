// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			Solution T = new Solution();
			ArrayList<Integer> arr= T.mergeKArrays(a, n);
			for(int i = 0; i < n*n ; i++)
			    System.out.print(arr.get(i)+" ");
		    System.out.println();
		    
		    t--;
		}
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        PriorityQueue<Triplet> pq=new PriorityQueue<Triplet>(new Comparator<Triplet>(){
          public int compare(Triplet t1,Triplet t2)
          {  return t1.val-t2.val;}
        });
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<K;i++){
            pq.offer(new Triplet(arr[i][0],i,0));
        }
        while(!pq.isEmpty()){
            Triplet cur=pq.poll();
            ans.add(cur.val);
            int row=cur.row,col=cur.col;
            if(col+1<arr[row].length){
                pq.offer(new Triplet(arr[row][++col],row,col));
            }
        }
        return ans;
        
    }
    static class Triplet {
        int val,row,col;
        Triplet(int val,int row,int col){
            this.val=val;
            this.row=row;
            this.col=col;
        }
    }
}