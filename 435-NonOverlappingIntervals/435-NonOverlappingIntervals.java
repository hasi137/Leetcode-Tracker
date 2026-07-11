// Last updated: 11/07/2026, 12:36:12
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        int count = 0;
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);
        int end = intervals[0][1];
        for(int i = 1; i <n;i++){
            if(intervals[i][0] < end){
                count++;
            }else{
                end = intervals[i][1];
            }

        }
        return count;  
    }
}