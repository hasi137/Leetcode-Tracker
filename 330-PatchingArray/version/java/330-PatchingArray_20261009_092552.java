// Last updated: 09/10/2026, 09:25:52
1class Solution {
2    public int minPatches(int[] nums, int n) {
3        long miss = 1;
4        int i = 0, ans = 0;
5
6        while (miss <= n) {
7            if (i < nums.length && nums[i] <= miss) {
8                miss += nums[i++];
9            } else {
10                miss += miss;
11                ans++;
12            }
13        }
14
15        return ans;
16    }
17}