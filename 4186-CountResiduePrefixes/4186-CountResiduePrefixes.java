// Last updated: 11/07/2026, 12:31:08
class Solution {
    public int residuePrefixes(String s) {
        int count = 0;
        int[] freq = new int[26];
        int distinct = 0;

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            
            if (freq[idx] == 0) {
                distinct++;
            }
            freq[idx]++;
            
            if (distinct == (i + 1) % 3) {
                count++;
            }
        }
        
        return count;
    }
}
