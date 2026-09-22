// Last updated: 22/09/2026, 09:27:38
1class Solution {
2    public int minimumDeleteSum(String s1, String s2) {
3        int m = s1.length();
4        int n = s2.length();
5
6        int[][] dp = new int[m + 1][n + 1];
7
8        for (int i = 1; i <= m; i++)
9            dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
10
11        for (int j = 1; j <= n; j++)
12            dp[0][j] = dp[0][j - 1] + s2.charAt(j - 1);
13
14        for (int i = 1; i <= m; i++) {
15            for (int j = 1; j <= n; j++) {
16
17                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
18                    dp[i][j] = dp[i - 1][j - 1];
19                } else {
20                    dp[i][j] = Math.min(
21                        s1.charAt(i - 1) + dp[i - 1][j],
22                        s2.charAt(j - 1) + dp[i][j - 1]
23                    );
24                }
25            }
26        }
27
28        return dp[m][n];
29    }
30}