// Last updated: 11/07/2026, 12:31:45
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum =0;
        int t=x;
        while(x!=0){
            sum+=x%10;
            x/=10;
        }
        return t%sum==0 ?sum:-1;
        
    }
}