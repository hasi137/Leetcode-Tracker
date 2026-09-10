// Last updated: 10/09/2026, 16:17:55
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        long a = 0;
4        long b = (long)Math.sqrt(c);
5
6        while (a <= b) {
7            long sum = a * a + b * b;
8
9            if (sum == c)
10                return true;
11            else if (sum < c)
12                a++;
13            else
14                b--;
15        }
16
17        return false;
18    }
19}