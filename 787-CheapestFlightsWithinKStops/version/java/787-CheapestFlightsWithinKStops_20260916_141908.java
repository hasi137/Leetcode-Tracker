// Last updated: 16/09/2026, 14:19:08
1import java.util.*;
2
3class Solution {
4    public int findLongestChain(int[][] pairs) {
5        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
6
7        int ans = 0;
8        int end = Integer.MIN_VALUE;
9
10        for (int[] p : pairs) {
11            if (p[0] > end) {
12                ans++;
13                end = p[1];
14            }
15        }
16
17        return ans;
18    }
19}