// Last updated: 11/07/2026, 12:38:48
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minprice = prices[0];
        int profit = 0;
        for(int i =1 ;i < n; i++){
            if(prices[i] < minprice){
                minprice = prices[i];
            }else{
                profit = Math.max(profit, prices[i] - minprice);
            }
        }
        return profit;
        
    }
}