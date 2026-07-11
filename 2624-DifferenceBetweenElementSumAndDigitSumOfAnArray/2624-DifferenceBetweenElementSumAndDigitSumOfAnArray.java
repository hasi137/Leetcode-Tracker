// Last updated: 11/07/2026, 12:32:32
class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum=0;
        for( int i=0;i<nums.length;i++){
            int num =nums[i];
            elementSum+=num;
            while(num!= 0){
                int last =num%10;
                digitSum+=last;
                num/=10;
            }
        }
        return elementSum - digitSum;
        
    }
}    
        
    