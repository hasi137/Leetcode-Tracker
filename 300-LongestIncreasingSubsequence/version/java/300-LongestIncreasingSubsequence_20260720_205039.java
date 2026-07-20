// Last updated: 20/07/2026, 20:50:39
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n = nums.length;
4        int[] dp = new int[n];
5        int max = 1;
6
7        for (int i = 0; i < n; i++) {
8            dp[i] = 1;
9
10            for (int j = 0; j < i; j++) {
11                if (nums[i] > nums[j]) {
12                    dp[i] = Math.max(dp[i], dp[j] + 1);
13                }
14            }
15
16            max = Math.max(max, dp[i]);
17        }
18
19        return max;
20    }
21}