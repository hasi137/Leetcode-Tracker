// Last updated: 22/09/2026, 10:14:24
1class Solution {
2    public int maxProduct(String[] words) {
3        int n = words.length;
4        int[] mask = new int[n];
5
6        for (int i = 0; i < n; i++) {
7            for (char c : words[i].toCharArray()) {
8                mask[i] |= 1 << (c - 'a');
9            }
10        }
11
12        int ans = 0;
13
14        for (int i = 0; i < n; i++) {
15            for (int j = i + 1; j < n; j++) {
16                if ((mask[i] & mask[j]) == 0) {
17                    ans = Math.max(ans, words[i].length() * words[j].length());
18                }
19            }
20        }
21
22        return ans;
23    }
24}