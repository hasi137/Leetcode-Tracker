// Last updated: 13/07/2026, 20:09:14
1class Solution {
2    public int characterReplacement(String s, int k) {
3        int[] count = new int[26];
4        int left = 0;
5        int maxCount = 0;
6        int maxLength = 0;
7
8        for (int right = 0; right < s.length(); right++) {
9            count[s.charAt(right) - 'A']++;
10            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);
11
12            while ((right - left + 1) - maxCount > k) {
13                count[s.charAt(left) - 'A']--;
14                left++;
15            }
16
17            maxLength = Math.max(maxLength, right - left + 1);
18        }
19
20        return maxLength;
21    }
22}