// Last updated: 07/10/2026, 23:03:43
1class Solution {
2    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
3        int[] ans = new int[queries.length];
4
5        List<List<Integer>> graph = new ArrayList<>();
6
7        for (int i = 0; i < n; i++) {
8            graph.add(new ArrayList<>());
9        }
10
11        for (int i = 0; i < n - 1; i++) {
12            graph.get(i).add(i + 1);
13        }
14
15        for (int i = 0; i < queries.length; i++) {
16            int u = queries[i][0];
17            int v = queries[i][1];
18
19            graph.get(u).add(v);
20
21            int[] dist = new int[n];
22            Arrays.fill(dist, -1);
23
24            Queue<Integer> q = new LinkedList<>();
25            q.add(0);
26            dist[0] = 0;
27
28            while (!q.isEmpty()) {
29                int node = q.poll();
30
31                for (int next : graph.get(node)) {
32                    if (dist[next] == -1) {
33                        dist[next] = dist[node] + 1;
34                        q.add(next);
35                    }
36                }
37            }
38
39            ans[i] = dist[n - 1];
40        }
41
42        return ans;
43    }
44}