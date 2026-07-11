// Last updated: 11/07/2026, 12:31:43
class Solution {
    public int minimumOperations(int[] nums) {
        int min = 0;
        for (int x : nums) {
            if (x % 3 != 0) {
                min++;
            }
        }
        return min;
    }
}
