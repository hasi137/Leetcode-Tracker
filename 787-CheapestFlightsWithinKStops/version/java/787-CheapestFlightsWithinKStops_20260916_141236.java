// Last updated: 16/09/2026, 14:12:36
1class Solution {
2    public int deleteAndEarn(int[] nums) {
3        int[] sum = new int[10001];
4
5        for (int x : nums)
6            sum[x] += x;
7
8        int prev2 = 0;
9        int prev1 = 0;
10
11        for (int i = 1; i <= 10000; i++) {
12            int cur = Math.max(prev1, prev2 + sum[i]);
13
14            prev2 = prev1;
15            prev1 = cur;
16        }
17
18        return prev1;
19    }
20}