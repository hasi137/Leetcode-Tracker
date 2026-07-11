// Last updated: 11/07/2026, 12:36:02
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum =0;
        for(int i =1; i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return num==sum?true:false;
        
    }
}