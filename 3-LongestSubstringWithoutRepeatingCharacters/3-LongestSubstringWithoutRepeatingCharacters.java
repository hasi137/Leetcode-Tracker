// Last updated: 11/07/2026, 12:41:05
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int[] freq = new int[128];
            int j;

            for (j = i; j < n; j++) {
                if (freq[s.charAt(j)] > 0) {
                    break;
                }
                freq[s.charAt(j)]++;
            }

            ans = Math.max(ans, j - i);
        }

        return ans;
    }
}