// Last updated: 11/07/2026, 12:39:57
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currentSum = 0;
        int maxSum = nums[0];
        for(int i =0; i<n ;i++){
            if( currentSum < 0){
                currentSum = nums[i];
            }else{
                currentSum +=nums[i];
            }
            
            if( currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        return maxSum;
        
    }
}