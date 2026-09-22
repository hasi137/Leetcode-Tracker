// Last updated: 22/09/2026, 10:28:03
1class Solution {
2    public int longestIncreasingPath(int[][] matrix) {
3        int m = matrix.length, n = matrix[0].length;
4        int[][] dp = new int[m][n];
5        int ans = 0;
6
7        for (int i = 0; i < m; i++)
8            for (int j = 0; j < n; j++)
9                ans = Math.max(ans, dfs(matrix, dp, i, j));
10
11        return ans;
12    }
13
14    int dfs(int[][] a, int[][] dp, int i, int j) {
15        if (dp[i][j] > 0)
16            return dp[i][j];
17
18        int ans = 1;
19
20        if (i > 0 && a[i - 1][j] > a[i][j])
21            ans = Math.max(ans, 1 + dfs(a, dp, i - 1, j));
22
23        if (i + 1 < a.length && a[i + 1][j] > a[i][j])
24            ans = Math.max(ans, 1 + dfs(a, dp, i + 1, j));
25
26        if (j > 0 && a[i][j - 1] > a[i][j])
27            ans = Math.max(ans, 1 + dfs(a, dp, i, j - 1));
28
29        if (j + 1 < a[0].length && a[i][j + 1] > a[i][j])
30            ans = Math.max(ans, 1 + dfs(a, dp, i, j + 1));
31
32        return dp[i][j] = ans;
33    }
34}