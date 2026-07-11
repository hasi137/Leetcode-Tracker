// Last updated: 11/07/2026, 12:37:31
import java.util.*;

class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        int ans = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1' && vis[i][j] == false){
                    ans++;
                    bfs(i, j, m, n, vis, grid);
                }
            }
        }

        return ans;
    }

    void bfs(int i, int j, int m, int n, boolean[][] vis, char[][] grid){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        vis[i][j] = true;

        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};

        while(q.size() > 0){
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];

            for(int k = 0; k < 4; k++){
                int nextrow = x + dir[k][0];
                int nextcol = y + dir[k][1];

                if(nextrow >= 0 && nextrow < m &&
                   nextcol >= 0 && nextcol < n &&
                   !vis[nextrow][nextcol] &&
                   grid[nextrow][nextcol] == '1'){

                    vis[nextrow][nextcol] = true;
                    q.add(new int[]{nextrow, nextcol});
                }
            }
        }
    }
}