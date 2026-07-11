// Last updated: 11/07/2026, 12:36:10
class Solution {
    public int arrangeCoins(int n) {
        int row =1;
        while(n>=row){
            n-=row;
            row++;
        }
        return row-1 ;
    }
}