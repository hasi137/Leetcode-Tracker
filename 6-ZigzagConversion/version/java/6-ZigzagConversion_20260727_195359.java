// Last updated: 27/07/2026, 19:53:59
1class Solution {
2    public double myPow(double x, int n) {
3
4        long p = n;
5        if (p < 0) {
6            x = 1 / x;
7            p = -p;
8        }
9
10        double ans = 1;
11
12        while (p > 0) {
13            if (p % 2 == 1)
14                ans *= x;
15
16            x *= x;
17            p /= 2;
18        }
19
20        return ans;
21    }
22}