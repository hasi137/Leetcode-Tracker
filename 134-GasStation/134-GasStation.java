// Last updated: 11/07/2026, 12:38:39
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tot =0 , curr = 0, start =0;
        for( int i =0; i < gas.length;i++){
            int diff = gas[i] - cost[i];
            tot += diff;
            curr += diff;
            if( curr  < 0){
                start = i+1;
                curr =0;
            }
        }
        return tot >= 0 ? start : -1;
    }    
            
}