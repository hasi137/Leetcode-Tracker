// Last updated: 11/07/2026, 12:37:24
class Solution {
    public boolean containsDuplicate(int[] nums) {
        java.util.Arrays.sort(nums);   

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}