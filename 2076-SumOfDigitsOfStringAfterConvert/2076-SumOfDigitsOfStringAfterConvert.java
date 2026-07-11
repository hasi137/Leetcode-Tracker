// Last updated: 11/07/2026, 12:33:17
class Solution {
    public int getLucky(String s, int k) {
        int total = 0;
        for (char ch : s.toCharArray()) {
            int num = ch - 'a' + 1; 
            total += num / 10 + num % 10;
        }
        
        for (int i = 1; i < k; i++) {
            int sum = 0;
            while (total > 0) {
                sum += total % 10;
                total /= 10;
            }
            total = sum;
        }
        
        return total;
    }
}
