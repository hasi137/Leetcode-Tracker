// Last updated: 13/07/2026, 20:23:34
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        Queue<int[]> q = new LinkedList<>();
4        int fresh = 0, time = 0;
5
6        for (int i = 0; i < grid.length; i++) {
7            for (int j = 0; j < grid[0].length; j++) {
8                if (grid[i][j] == 2)
9                    q.offer(new int[]{i, j});
10                else if (grid[i][j] == 1)
11                    fresh++;
12            }
13        }
14
15        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
16
17        while (!q.isEmpty() && fresh > 0) {
18            int size = q.size();
19            time++;
20
21            while (size-- > 0) {
22                int[] cur = q.poll();
23
24                for (int[] d : dir) {
25                    int r = cur[0] + d[0];
26                    int c = cur[1] + d[1];
27
28                    if (r >= 0 && c >= 0 && r < grid.length && c < grid[0].length && grid[r][c] == 1) {
29                        grid[r][c] = 2;
30                        fresh--;
31                        q.offer(new int[]{r, c});
32                    }
33                }
34            }
35        }
36
37        return fresh == 0 ? time : -1;
38    }
39}