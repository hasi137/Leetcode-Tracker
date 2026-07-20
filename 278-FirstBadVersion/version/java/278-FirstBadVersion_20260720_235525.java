// Last updated: 20/07/2026, 23:55:25
1class Solution {
2    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
3
4        if (n == 1)
5            return Arrays.asList(0);
6
7        List<List<Integer>> graph = new ArrayList<>();
8        for (int i = 0; i < n; i++)
9            graph.add(new ArrayList<>());
10
11        int[] degree = new int[n];
12
13        for (int[] e : edges) {
14            graph.get(e[0]).add(e[1]);
15            graph.get(e[1]).add(e[0]);
16            degree[e[0]]++;
17            degree[e[1]]++;
18        }
19
20        Queue<Integer> q = new LinkedList<>();
21
22        for (int i = 0; i < n; i++) {
23            if (degree[i] == 1)
24                q.offer(i);
25        }
26
27        int remaining = n;
28
29        while (remaining > 2) {
30
31            int size = q.size();
32            remaining -= size;
33
34            for (int i = 0; i < size; i++) {
35
36                int leaf = q.poll();
37
38                for (int next : graph.get(leaf)) {
39                    degree[next]--;
40
41                    if (degree[next] == 1)
42                        q.offer(next);
43                }
44            }
45        }
46
47        return new ArrayList<>(q);
48    }
49}