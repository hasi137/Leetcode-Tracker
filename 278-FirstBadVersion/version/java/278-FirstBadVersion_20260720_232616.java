// Last updated: 20/07/2026, 23:26:16
1class Solution {
2    public int numSquares(int n) {
3        int[] dp = new int[n + 1];
4
5        for (int i = 1; i <= n; i++) {
6            dp[i] = i;
7            for (int j = 1; j * j <= i; j++) {
8                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
9            }
10        }
11
12        return dp[n];
13    }
14}