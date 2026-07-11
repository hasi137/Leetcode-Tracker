// Last updated: 11/07/2026, 12:36:33
class Solution {
    public boolean isPowerOfFour(int n) {
        return( (n>0 && ((n&(n-1))==0))& (n&0x55555555)!=0);
        
    }
}