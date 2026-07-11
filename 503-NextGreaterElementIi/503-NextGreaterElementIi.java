// Last updated: 11/07/2026, 12:36:04
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = -1; 
            for (int j = 1; j < n; j++) {
                int nextIndex = (i + j) % n;
                if (nums[nextIndex] > nums[i]) {
                    result[i] = nums[nextIndex];
                    break; 
                }
            }
        }

        return result;
    }
}
