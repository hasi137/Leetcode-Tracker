// Last updated: 16/09/2026, 14:22:51
1import java.util.*;
2
3class Solution {
4    public int[][] updateMatrix(int[][] mat) {
5        int m = mat.length;
6        int n = mat[0].length;
7
8        Queue<int[]> q = new LinkedList<>();
9
10        for (int i = 0; i < m; i++) {
11            for (int j = 0; j < n; j++) {
12                if (mat[i][j] == 0) {
13                    q.add(new int[]{i, j});
14                } else {
15                    mat[i][j] = -1;
16                }
17            }
18        }
19
20        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
21
22        while (!q.isEmpty()) {
23            int[] cur = q.poll();
24
25            for (int[] d : dir) {
26                int x = cur[0] + d[0];
27                int y = cur[1] + d[1];
28
29                if (x >= 0 && x < m && y >= 0 && y < n && mat[x][y] == -1) {
30                    mat[x][y] = mat[cur[0]][cur[1]] + 1;
31                    q.add(new int[]{x, y});
32                }
33            }
34        }
35
36        return mat;
37    }
38}