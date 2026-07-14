// Last updated: 14/07/2026, 22:08:42
1class Solution {
2
3    int[] parent;
4
5    public int[] findRedundantConnection(int[][] edges) {
6        int n = edges.length;
7        parent = new int[n + 1];
8
9        for (int i = 1; i <= n; i++)
10            parent[i] = i;
11
12        for (int[] edge : edges) {
13            int u = edge[0];
14            int v = edge[1];
15
16            int pu = find(u);
17            int pv = find(v);
18
19            if (pu == pv)
20                return edge;
21
22            parent[pu] = pv;
23        }
24
25        return new int[0];
26    }
27
28    private int find(int x) {
29        if (parent[x] != x)
30            parent[x] = find(parent[x]);
31        return parent[x];
32    }
33}