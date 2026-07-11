// Last updated: 11/07/2026, 12:36:53
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum =0;
        for( int num :nums){
            sum+=num;
        }
        int total = n*(n+1)/2;
        return total - sum;
    }
}