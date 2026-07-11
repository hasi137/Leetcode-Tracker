// Last updated: 11/07/2026, 12:33:20
class Solution {
    public int arraySign(int[] nums) {
        int product=0;
        for( int i =0;i<nums.length;i++){
            int num = nums[i];
            if(num==0) {
                return 0;
            }else if(num<0) {
                product++;
            }  
        
        }
        return(product%2==0)?1:-1;
    } 
        
}        
        