// Last updated: 11/07/2026, 12:33:58
class Solution {
public:
    int subtractProductAndSum(int n) {
        int sum =0,mul =1;
        while( n!=0){
            sum+=n%10;
            mul*=n%10;
            n/=10;
        }
        return mul - sum;
        
    }
};