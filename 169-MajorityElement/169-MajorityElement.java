// Last updated: 11/07/2026, 12:38:16
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n/2];
        
    }
}