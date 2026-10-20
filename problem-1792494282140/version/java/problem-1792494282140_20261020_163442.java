// Last updated: 20/10/2026, 16:34:42
1class Solution {
2    public int numDistinct(String s, String t) {
3        int m = s.length();
4        int n = t.length();
5
6        int[][] dp = new int[m + 1][n + 1];
7
8        for (int i = 0; i <= m; i++)
9            dp[i][0] = 1;
10
11        for (int i = 1; i <= m; i++) {
12            for (int j = 1; j <= n; j++) {
13                if (s.charAt(i - 1) == t.charAt(j - 1)) {
14                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
15                } else {
16                    dp[i][j] = dp[i - 1][j];
17                }
18            }
19        }
20
21        return dp[m][n];
22    }
23}