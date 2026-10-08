// Last updated: 08/10/2026, 09:19:01
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5
6        int i = 0, j = 0;
7
8        while (i < g.length && j < s.length) {
9            if (s[j] >= g[i]) i++;
10            j++;
11        }
12
13        return i;
14    }
15}