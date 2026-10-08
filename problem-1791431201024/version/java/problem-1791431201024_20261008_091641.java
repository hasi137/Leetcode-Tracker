// Last updated: 08/10/2026, 09:16:41
1class Solution {
2    public int findMinArrowShots(int[][] points) {
3        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
4
5        int arrows = 1;
6        int end = points[0][1];
7
8        for (int i = 1; i < points.length; i++) {
9            if (points[i][0] > end) {
10                arrows++;
11                end = points[i][1];
12            }
13        }
14
15        return arrows;
16    }
17}