// Last updated: 11/07/2026, 12:32:39
class Solution {
    public int numberOfCuts(int n) { 
        if (n==1) return 0;
        if(n%2==0) return n/2;
        else return n;
        
    }
}