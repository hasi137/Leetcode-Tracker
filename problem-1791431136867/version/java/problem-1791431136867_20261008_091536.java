// Last updated: 08/10/2026, 09:15:36
1class Solution {
2    public int[] findRightInterval(int[][] intervals) {
3        int n = intervals.length;
4        int[][] a = new int[n][2];
5
6        for (int i = 0; i < n; i++) {
7            a[i][0] = intervals[i][0];
8            a[i][1] = i;
9        }
10
11        Arrays.sort(a, (x, y) -> x[0] - y[0]);
12
13        int[] ans = new int[n];
14
15        for (int i = 0; i < n; i++) {
16            int l = 0, r = n - 1;
17
18            while (l <= r) {
19                int m = (l + r) / 2;
20                if (a[m][0] >= intervals[i][1])
21                    r = m - 1;
22                else
23                    l = m + 1;
24            }
25
26            ans[i] = l == n ? -1 : a[l][1];
27        }
28
29        return ans;
30    }
31}