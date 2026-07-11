// Last updated: 11/07/2026, 12:37:28
class Solution{
    public static int sumOfSquares( int n){
        int sum =0;
        while(n!=0){
            int d =n%10;
            sum+=d*d;
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=sumOfSquares(slow);
            fast=sumOfSquares(sumOfSquares(fast));
        }while(slow!=fast);
        return slow==1?true:false;    
    }
}