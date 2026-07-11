// Last updated: 11/07/2026, 12:33:46
class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        int start = low%2==0?low+1:low;
        for(int i = start;i<=high;i=i+2){
            count++;

        }
        return count;        
    }
}