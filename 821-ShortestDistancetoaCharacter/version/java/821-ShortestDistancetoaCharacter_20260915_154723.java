// Last updated: 15/09/2026, 15:47:23
1class Solution {
2    public int[] shortestToChar(String s, char c) {
3        int n = s.length();
4        int[] ans = new int[n];
5
6        int pos = -n;
7
8        for (int i = 0; i < n; i++) {
9            if (s.charAt(i) == c)
10                pos = i;
11
12            ans[i] = i - pos;
13        }
14
15        pos = 2 * n;
16
17        for (int i = n - 1; i >= 0; i--) {
18            if (s.charAt(i) == c)
19                pos = i;
20
21            ans[i] = Math.min(ans[i], pos - i);
22        }
23
24        return ans;
25    }
26}