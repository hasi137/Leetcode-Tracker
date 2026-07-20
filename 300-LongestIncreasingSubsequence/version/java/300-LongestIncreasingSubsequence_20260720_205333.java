// Last updated: 20/07/2026, 20:53:33
1class Solution {
2    public int lastRemaining(int n) {
3        int head = 1;
4        int step = 1;
5        boolean left = true;
6        int remaining = n;
7
8        while (remaining > 1) {
9            if (left || remaining % 2 == 1) {
10                head += step;
11            }
12
13            remaining /= 2;
14            step *= 2;
15            left = !left;
16        }
17
18        return head;
19    }
20}