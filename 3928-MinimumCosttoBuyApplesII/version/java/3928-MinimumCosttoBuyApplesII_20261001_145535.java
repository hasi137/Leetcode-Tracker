// Last updated: 01/10/2026, 14:55:35
1import java.util.*;
2
3class Solution {
4    public int[] minCost(int n, int[] prices, int[][] roads) {
5
6        List<long[]>[] graph1 = new ArrayList[n];
7        List<long[]>[] graph2 = new ArrayList[n];
8
9        for (int i = 0; i < n; i++) {
10            graph1[i] = new ArrayList<>();
11            graph2[i] = new ArrayList<>();
12        }
13
14        for (int[] r : roads) {
15            int u = r[0];
16            int v = r[1];
17            long cost = r[2];
18            long tax = r[3];
19
20            // Travel without apples
21            graph1[u].add(new long[]{v, cost});
22            graph1[v].add(new long[]{u, cost});
23
24            // Travel with apples
25            graph2[u].add(new long[]{v, cost * tax});
26            graph2[v].add(new long[]{u, cost * tax});
27        }
28
29        int[] ans = new int[n];
30
31        for (int start = 0; start < n; start++) {
32
33            long[] d1 = dijkstra(start, graph1, n);
34            long[] d2 = dijkstra(start, graph2, n);
35
36            long best = prices[start];
37
38            for (int j = 0; j < n; j++) {
39
40                if (d1[j] == Long.MAX_VALUE || d2[j] == Long.MAX_VALUE) {
41                    continue;
42                }
43
44                long total = d1[j] + prices[j] + d2[j];
45
46                best = Math.min(best, total);
47            }
48
49            ans[start] = (int) best;
50        }
51
52        return ans;
53    }
54
55    public long[] dijkstra(int start, List<long[]>[] graph, int n) {
56
57        long[] dist = new long[n];
58        Arrays.fill(dist, Long.MAX_VALUE);
59
60        PriorityQueue<long[]> pq = new PriorityQueue<>(
61            (a, b) -> Long.compare(a[0], b[0])
62        );
63
64        dist[start] = 0;
65        pq.offer(new long[]{0, start});
66
67        while (!pq.isEmpty()) {
68
69            long[] cur = pq.poll();
70
71            long distance = cur[0];
72            int node = (int) cur[1];
73
74            if (distance != dist[node]) {
75                continue;
76            }
77
78            for (long[] edge : graph[node]) {
79
80                int next = (int) edge[0];
81                long cost = edge[1];
82
83                long newDist = distance + cost;
84
85                if (newDist < dist[next]) {
86                    dist[next] = newDist;
87                    pq.offer(new long[]{newDist, next});
88                }
89            }
90        }
91
92        return dist;
93    }
94}