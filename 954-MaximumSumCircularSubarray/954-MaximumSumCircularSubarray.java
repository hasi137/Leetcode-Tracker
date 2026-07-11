// Last updated: 11/07/2026, 12:35:17
class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int total = 0;

        int maxSum = nums[0];
        int curMax = 0;

        int minSum = nums[0];
        int curMin = 0;

        for (int i = 0; i < nums.length; i++) {

            curMax = Math.max(curMax + nums[i], nums[i]);
            maxSum = Math.max(maxSum, curMax);

            curMin = Math.min(curMin + nums[i], nums[i]);
            minSum = Math.min(minSum, curMin);

            total += nums[i];
        }

        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, total - minSum);
    }
}