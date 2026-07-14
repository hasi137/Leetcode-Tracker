// Last updated: 14/07/2026, 22:16:37
1class Solution {
2    public int[][] kClosest(int[][] points, int k) {
3
4        PriorityQueue<int[]> pq = new PriorityQueue<>(
5            (a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1])
6        );
7
8        for (int[] p : points) {
9            pq.offer(p);
10            if (pq.size() > k)
11                pq.poll();
12        }
13
14        int[][] ans = new int[k][2];
15
16        for (int i = 0; i < k; i++)
17            ans[i] = pq.poll();
18
19        return ans;
20    }
21}