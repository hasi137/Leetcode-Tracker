// Last updated: 16/09/2026, 14:17:21
1class Solution {
2    public int countSubstrings(String s) {
3        int ans = 0;
4
5        for (int i = 0; i < s.length(); i++) {
6            ans += count(s, i, i);
7            ans += count(s, i, i + 1);
8        }
9
10        return ans;
11    }
12
13    int count(String s, int left, int right) {
14        int ans = 0;
15
16        while (left >= 0 && right < s.length() &&
17               s.charAt(left) == s.charAt(right)) {
18
19            ans++;
20            left--;
21            right++;
22        }
23
24        return ans;
25    }
26}