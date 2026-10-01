// Last updated: 01/10/2026, 15:04:17
1import java.util.*;
2
3class Solution {
4    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
5
6        int m = grid.size();
7        int n = grid.get(0).size();
8
9        int[][] visited = new int[m][n];
10
11        Queue<int[]> q = new LinkedList<>();
12
13        health -= grid.get(0).get(0);
14
15        if (health <= 0) {
16            return false;
17        }
18
19        q.add(new int[]{0, 0, health});
20        visited[0][0] = health;
21
22        int[] dr = {-1, 1, 0, 0};
23        int[] dc = {0, 0, -1, 1};
24
25        while (!q.isEmpty()) {
26
27            int[] cur = q.poll();
28
29            int r = cur[0];
30            int c = cur[1];
31            int h = cur[2];
32
33            if (r == m - 1 && c == n - 1) {
34                return true;
35            }
36
37            for (int i = 0; i < 4; i++) {
38
39                int nr = r + dr[i];
40                int nc = c + dc[i];
41
42                if (nr >= 0 && nr < m && nc >= 0 && nc < n) {
43
44                    int newHealth = h - grid.get(nr).get(nc);
45
46                    if (newHealth > 0 && newHealth > visited[nr][nc]) {
47
48                        visited[nr][nc] = newHealth;
49
50                        q.add(new int[]{nr, nc, newHealth});
51                    }
52                }
53            }
54        }
55
56        return false;
57    }
58}