// Last updated: 20/07/2026, 23:54:19
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4        if (n == 1) return 0;
5
6        int[] dp = new int[n];
7        dp[1] = Math.max(0, prices[1] - prices[0]);
8
9        for (int i = 2; i < n; i++) {
10            dp[i] = dp[i - 1];
11
12            for (int j = 0; j < i; j++) {
13                int profit = prices[i] - prices[j];
14                if (j >= 2)
15                    profit += dp[j - 2];
16
17                dp[i] = Math.max(dp[i], profit);
18            }
19        }
20
21        return dp[n - 1];
22    }
23}