// Last updated: 22/09/2026, 10:20:09
1class Solution {
2    public boolean isPowerOfThree(int n) {
3        if (n <= 0)
4            return false;
5
6        return 1162261467 % n == 0;
7    }
8}