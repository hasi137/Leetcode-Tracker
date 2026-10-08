// Last updated: 08/10/2026, 09:14:27
1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        int n = matrix.length;
4        int lo = matrix[0][0], hi = matrix[n - 1][n - 1];
5
6        while (lo < hi) {
7            int mid = lo + (hi - lo) / 2;
8            int count = 0;
9
10            for (int[] row : matrix) {
11                for (int x : row) {
12                    if (x <= mid) count++;
13                }
14            }
15
16            if (count < k) lo = mid + 1;
17            else hi = mid;
18        }
19        return lo;
20    }
21}