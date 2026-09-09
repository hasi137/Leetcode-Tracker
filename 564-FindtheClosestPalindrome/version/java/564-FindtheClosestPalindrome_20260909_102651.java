// Last updated: 09/09/2026, 10:26:51
1class Solution {
2    public String nearestPalindromic(String n) {
3        long x = Long.parseLong(n);
4        int len = n.length();
5
6        long[] p = new long[5];
7
8        p[0] = (long)Math.pow(10, len - 1) - 1;
9        p[1] = (long)Math.pow(10, len) + 1;
10
11        long half = Long.parseLong(n.substring(0, (len + 1) / 2));
12
13        for (int i = 0; i < 3; i++) {
14            long h = half + i - 1;
15            String s = String.valueOf(h);
16
17            String r = new StringBuilder(
18                len % 2 == 0 ? s : s.substring(0, s.length() - 1)
19            ).reverse().toString();
20
21            p[i + 2] = Long.parseLong(s + r);
22        }
23
24        long ans = -1;
25
26        for (long v : p) {
27            if (v == x) continue;
28
29            if (ans == -1 || Math.abs(v - x) < Math.abs(ans - x) ||
30                Math.abs(v - x) == Math.abs(ans - x) && v < ans) {
31                ans = v;
32            }
33        }
34
35        return String.valueOf(ans);
36    }
37}