// Last updated: 15/09/2026, 16:07:10
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int n = isConnected.length;
4        boolean[] visited = new boolean[n];
5        int ans = 0;
6
7        for (int i = 0; i < n; i++) {
8            if (!visited[i]) {
9                ans++;
10                dfs(isConnected, visited, i);
11            }
12        }
13
14        return ans;
15    }
16
17    void dfs(int[][] a, boolean[] visited, int i) {
18        visited[i] = true;
19
20        for (int j = 0; j < a.length; j++) {
21            if (a[i][j] == 1 && !visited[j])
22                dfs(a, visited, j);
23        }
24    }
25}