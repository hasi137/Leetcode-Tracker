// Last updated: 11/07/2026, 12:32:37
class Solution {
    public int countDigits(int num) {
        int original = num;
        int count =0;
        while(num!=0){
            int d = num%10;
            if(original%d==0) count++;
            num/=10;
        }
        return count;


        
    }
}