// Last updated: 15/09/2026, 14:49:20
1import java.util.*;
2
3class Solution {
4    int ans = 0;
5
6    void solve(int[] a, int low, int high) {
7        if (a.length < 2 || low == high)
8            return;
9
10        int mid = (low + high) / 2;
11
12        int[] left = new int[a.length];
13        int[] right = new int[a.length];
14        int lc = 0, rc = 0;
15
16        int[] lowStack = new int[a.length];
17        int[] highStack = new int[a.length];
18        int ls = 0, hs = 0;
19
20        for (int i = 0; i < a.length; i++) {
21
22            if (a[i] <= mid) {
23                while (ls > 0 && a[lowStack[ls - 1]] < a[i])
24                    ls--;
25
26                lowStack[ls++] = i;
27                left[lc++] = a[i];
28
29            } else {
30                while (hs > 0 && a[highStack[hs - 1]] >= a[i])
31                    hs--;
32
33                if (hs == 0) {
34                    ans += ls;
35                } else {
36                    int p = highStack[hs - 1];
37
38                    int l = 0, r = ls;
39
40                    while (l < r) {
41                        int m = (l + r) / 2;
42
43                        if (lowStack[m] <= p)
44                            l = m + 1;
45                        else
46                            r = m;
47                    }
48
49                    ans += ls - l;
50                }
51
52                highStack[hs++] = i;
53                right[rc++] = a[i];
54            }
55        }
56
57        left = Arrays.copyOf(left, lc);
58        right = Arrays.copyOf(right, rc);
59
60        solve(left, low, mid);
61        solve(right, mid + 1, high);
62    }
63
64    public int shadowPairs(int[] nums) {
65        int[] sorted = nums.clone();
66        Arrays.sort(sorted);
67
68        int m = 0;
69
70        for (int x : sorted) {
71            if (m == 0 || sorted[m - 1] != x)
72                sorted[m++] = x;
73        }
74
75        int[] a = new int[nums.length];
76
77        for (int i = 0; i < nums.length; i++)
78            a[i] = Arrays.binarySearch(sorted, 0, m, nums[i]) + 1;
79
80        ans = 0;
81        solve(a, 1, m);
82
83        return ans;
84    }
85}