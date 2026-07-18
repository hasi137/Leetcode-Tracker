// Last updated: 18/07/2026, 20:17:49
1class Solution {
2    public int[] runningSum(int[] nums) {
3        for (int i = 1; i < nums.length; i++)
4            nums[i] += nums[i - 1];
5        return nums;
6    }
7}