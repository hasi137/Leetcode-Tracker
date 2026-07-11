// Last updated: 11/07/2026, 12:38:37
class Solution {
    public int singleNumber(int[] nums) {
        int result =0;
        for(int num :nums){
            result^=num;
        }
        return result;     
    }
}