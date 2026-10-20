// Last updated: 20/10/2026, 16:33:51
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int m = obstacleGrid.length;
4        int n = obstacleGrid[0].length;
5
6        int[][] dp = new int[m][n];
7
8        if (obstacleGrid[0][0] == 1)
9            return 0;
10
11        dp[0][0] = 1;
12
13        for (int i = 0; i < m; i++) {
14            for (int j = 0; j < n; j++) {
15                if (obstacleGrid[i][j] == 1) {
16                    dp[i][j] = 0;
17                } else {
18                    if (i > 0)
19                        dp[i][j] += dp[i - 1][j];
20
21                    if (j > 0)
22                        dp[i][j] += dp[i][j - 1];
23                }
24            }
25        }
26
27        return dp[m - 1][n - 1];
28    }
29}