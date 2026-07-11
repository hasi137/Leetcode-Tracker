// Last updated: 11/07/2026, 12:31:17
class Solution {
    public int absDifference(int[] nums, int k) {  
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int t = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = t;
                }
            }
        }

        int minSum = 0, maxSum = 0;
        for (int i = 0; i < k; i++) {
            minSum += nums[i];
        }
        for (int i = nums.length - k; i < nums.length; i++) {
            maxSum += nums[i];
        }

        return Math.abs(maxSum - minSum);
    }
}
