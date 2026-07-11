// Last updated: 11/07/2026, 12:37:15
class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0 && (n & (n - 1)) == 0) ;            
    }
}          