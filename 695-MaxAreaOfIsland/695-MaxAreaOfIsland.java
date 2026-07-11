// Last updated: 11/07/2026, 12:35:36
import java.util.*;

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] vis = new boolean[m][n];
        int maxArea = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1 && !vis[i][j]) {
                    int area = bfs(i, j, m, n, vis, grid);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    int bfs(int i, int j, int m, int n, boolean[][] vis, int[][] grid) {

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        vis[i][j] = true;

        int area = 1;

        int[][] dir = {{-1,0}, {1,0}, {0,-1}, {0,1}};

        while (!q.isEmpty()) {

            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];

            for (int k = 0; k < 4; k++) {

                int nr = x + dir[k][0];
                int nc = y + dir[k][1];

                if (nr >= 0 && nr < m &&
                    nc >= 0 && nc < n &&
                    !vis[nr][nc] &&
                    grid[nr][nc] == 1) {

                    vis[nr][nc] = true;
                    area++;
                    q.add(new int[]{nr, nc});
                }
            }
        }

        return area;
    }
}