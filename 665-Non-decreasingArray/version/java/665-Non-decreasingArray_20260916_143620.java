// Last updated: 16/09/2026, 14:36:20
1class Solution {
2    public int minDeletionSize(String[] strs) {
3        int ans = 0;
4
5        for (int j = 0; j < strs[0].length(); j++) {
6            for (int i = 1; i < strs.length; i++) {
7                if (strs[i].charAt(j) < strs[i - 1].charAt(j)) {
8                    ans++;
9                    break;
10                }
11            }
12        }
13
14        return ans;
15    }
16}