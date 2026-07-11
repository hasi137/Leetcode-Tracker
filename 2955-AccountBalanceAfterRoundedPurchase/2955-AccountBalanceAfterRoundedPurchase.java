// Last updated: 11/07/2026, 12:31:55
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if(purchaseAmount%10<=4) return 100-(purchaseAmount/10)*10;
        else return 100 -((purchaseAmount/10)+1)*10;    
    }
}