// Last updated: 09/09/2026, 10:16:03
1class Solution {
2    public int checkRecord(int n) {
3        long[][][] dp = new long[n + 1][2][3];
4
5        dp[0][0][0] = 1;
6
7        for (int i = 0; i < n; i++) {
8            for (int a = 0; a < 2; a++) {
9                for (int l = 0; l < 3; l++) {
10
11                    // P
12                    dp[i + 1][a][0] += dp[i][a][l];
13
14                    // L
15                    if (l < 2)
16                        dp[i + 1][a][l + 1] += dp[i][a][l];
17
18                    // A
19                    if (a < 1)
20                        dp[i + 1][a + 1][0] += dp[i][a][l];
21
22                    dp[i + 1][a][0] %= 1000000007;
23                    dp[i + 1][a][1] %= 1000000007;
24                    dp[i + 1][a][2] %= 1000000007;
25                }
26            }
27        }
28
29        long answer = 0;
30
31        for (int a = 0; a < 2; a++) {
32            for (int l = 0; l < 3; l++) {
33                answer += dp[n][a][l];
34            }
35        }
36
37        return (int)(answer % 1000000007);
38    }
39}