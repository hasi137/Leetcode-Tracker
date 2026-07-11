// Last updated: 11/07/2026, 12:38:04
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while(n>=5){
            count+=(n/5);
            n=n/5;
        }
        return count;
    }
}