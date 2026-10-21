// Last updated: 21/10/2026, 17:54:14
1class Solution {
2    public int longestPalindromeSubseq(String s) {
3        int n = s.length();
4        int[][] dp = new int[n][n];
5
6        for (int i = n - 1; i >= 0; i--) {
7            dp[i][i] = 1;
8
9            for (int j = i + 1; j < n; j++) {
10                if (s.charAt(i) == s.charAt(j)) {
11                    dp[i][j] = 2 + dp[i + 1][j - 1];
12                } else {
13                    dp[i][j] = Math.max(dp[i + 1][j],
14                                        dp[i][j - 1]);
15                }
16            }
17        }
18
19        return dp[0][n - 1];
20    }
21}