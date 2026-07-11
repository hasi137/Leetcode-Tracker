// Last updated: 11/07/2026, 12:36:32
class Solution {
    public boolean isPerfectSquare(int num) {
        long i = 1;
        long j = num - 1;
        long mid = i + (j - i)/2;
        if(num == 1){
            return true;
        }
        while( i <= j){
            if(mid * mid == num){
                return true;
            }else if (mid*mid < num){
                i =mid+1;
            }else if(mid*mid > num){
                j = mid -1;
            }
            mid = i+(j-i)/2;
        }
        return false;
 
    }
}