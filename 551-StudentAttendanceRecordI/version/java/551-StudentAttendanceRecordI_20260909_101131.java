// Last updated: 09/09/2026, 10:11:31
1class Solution {
2    public boolean checkRecord(String s) {
3        int a = 0, l = 0;
4
5        for (char c : s.toCharArray()) {
6            if (c == 'A') {
7                a++;
8                if (a >= 2) return false;
9            }
10
11            if (c == 'L') {
12                l++;
13                if (l >= 3) return false;
14            } else {
15                l = 0;
16            }
17        }
18
19        return true;
20    }
21}