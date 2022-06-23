// { Driver Code Starts
import java.io.*; 
import java.util.*; 
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException  
    {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//testcases
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- > 0)
		{
		    String inputLine[] = br.readLine().trim().split(" ");
		    //size of array
		    int n = Integer.parseInt(inputLine[0]);
		    int start[] = new int[n];
		    int end[] = new int[n];
		    
		    //adding elements to arrays start and end
		    inputLine = br.readLine().trim().split(" ");
		    for(int i = 0; i < n; i++)
		     start[i] = Integer.parseInt(inputLine[i]);
		    
		    inputLine = br.readLine().trim().split(" ");
		    for(int i= 0; i < n; i++)
		      end[i] = Integer.parseInt(inputLine[i]);
		    
		    //function call
		    System.out.println(new Solution().activitySelection(start, end, n));
		}
    }
}

// } Driver Code Ends


class Solution
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
        // add your code here
        Pair[] in=new Pair[n];
        for(int i=0;i<n;i++){
            in[i]=new Pair(start[i],end[i]);
        }
        Arrays.sort(in);
        int ans=1,prev=in[0].second;
        for(int i=1;i<n;i++){
            if(in[i].first>prev){
                ans++;
                prev=in[i].second;
            }
        }
        return ans;
    }
}
class Pair implements Comparable<Pair>{
    int first,second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
    @Override
    public int compareTo(Pair p){
        return this.second-p.second;
    }
}