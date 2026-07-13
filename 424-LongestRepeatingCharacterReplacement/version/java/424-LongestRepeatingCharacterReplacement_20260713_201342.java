// Last updated: 13/07/2026, 20:13:42
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int[] dp = new int[amount + 1];
4
5        Arrays.fill(dp, amount + 1);
6        dp[0] = 0;
7
8        for (int i = 1; i <= amount; i++) {
9            for (int coin : coins) {
10                if (coin <= i) {
11                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
12                }
13            }
14        }
15
16        return dp[amount] > amount ? -1 : dp[amount];
17    }
18}