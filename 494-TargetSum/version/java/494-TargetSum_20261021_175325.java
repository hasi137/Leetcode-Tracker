// Last updated: 21/10/2026, 17:53:25
1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        int sum = 0;
4
5        for (int num : nums) {
6            sum += num;
7        }
8
9        if (Math.abs(target) > sum)
10            return 0;
11
12        if ((sum + target) % 2 != 0)
13            return 0;
14
15        int s = (sum + target) / 2;
16        int[] dp = new int[s + 1];
17
18        dp[0] = 1;
19
20        for (int num : nums) {
21            for (int j = s; j >= num; j--) {
22                dp[j] += dp[j - num];
23            }
24        }
25
26        return dp[s];
27    }
28}