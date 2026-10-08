// Last updated: 08/10/2026, 09:21:56
1class Solution {
2    public int minMoves2(int[] nums) {
3        Arrays.sort(nums);
4        int m = nums[nums.length / 2];
5        int ans = 0;
6
7        for (int x : nums)
8            ans += Math.abs(x - m);
9
10        return ans;
11    }
12}