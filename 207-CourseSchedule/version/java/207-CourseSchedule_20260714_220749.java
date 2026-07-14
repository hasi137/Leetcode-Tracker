// Last updated: 14/07/2026, 22:07:49
1class Solution {
2
3    int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
4
5    public List<List<Integer>> pacificAtlantic(int[][] heights) {
6        int m = heights.length, n = heights[0].length;
7
8        boolean[][] pac = new boolean[m][n];
9        boolean[][] atl = new boolean[m][n];
10
11        for (int i = 0; i < m; i++) {
12            dfs(heights, pac, i, 0);
13            dfs(heights, atl, i, n - 1);
14        }
15
16        for (int j = 0; j < n; j++) {
17            dfs(heights, pac, 0, j);
18            dfs(heights, atl, m - 1, j);
19        }
20
21        List<List<Integer>> ans = new ArrayList<>();
22
23        for (int i = 0; i < m; i++) {
24            for (int j = 0; j < n; j++) {
25                if (pac[i][j] && atl[i][j]) {
26                    ans.add(Arrays.asList(i, j));
27                }
28            }
29        }
30
31        return ans;
32    }
33
34    private void dfs(int[][] h, boolean[][] vis, int r, int c) {
35        vis[r][c] = true;
36
37        for (int[] d : dir) {
38            int nr = r + d[0];
39            int nc = c + d[1];
40
41            if (nr >= 0 && nr < h.length && nc >= 0 && nc < h[0].length
42                    && !vis[nr][nc]
43                    && h[nr][nc] >= h[r][c]) {
44
45                dfs(h, vis, nr, nc);
46            }
47        }
48    }
49}