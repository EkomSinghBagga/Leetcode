class Solution {
    public boolean divisorGame(int n) {
       return n%2==0;//if n is odd it wiil give even as we have to select an odd number
        //The person who gets 1 will lose
        //So for that if we  gewt an even n then alice can select 1 and it will become odd
        //then odd will get him only then alice wins
        //similarly in case of odd
    }
}