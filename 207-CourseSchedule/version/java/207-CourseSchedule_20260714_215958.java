// Last updated: 14/07/2026, 21:59:58
1class Solution {
2    public boolean canJump(int[] nums) {
3        int maxReach = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6            if (i > maxReach)
7                return false;
8
9            maxReach = Math.max(maxReach, i + nums[i]);
10        }
11
12        return true;
13    }
14}