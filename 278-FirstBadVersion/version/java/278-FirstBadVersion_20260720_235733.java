// Last updated: 20/07/2026, 23:57:33
1class Solution {
2    public int maxCoins(int[] nums) {
3        int n = nums.length;
4        int[] arr = new int[n + 2];
5        arr[0] = 1;
6        arr[n + 1] = 1;
7
8        for (int i = 0; i < n; i++)
9            arr[i + 1] = nums[i];
10
11        int[][] dp = new int[n + 2][n + 2];
12
13        for (int len = 1; len <= n; len++) {
14            for (int left = 1; left <= n - len + 1; left++) {
15                int right = left + len - 1;
16
17                for (int k = left; k <= right; k++) {
18                    dp[left][right] = Math.max(dp[left][right],
19                            dp[left][k - 1]
20                          + arr[left - 1] * arr[k] * arr[right + 1]
21                          + dp[k + 1][right]);
22                }
23            }
24        }
25
26        return dp[1][n];
27    }
28}