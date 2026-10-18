// Last updated: 18/10/2026, 04:15:42
1class Solution {
2    public int[] lastVisitedCell(char[][] grid) {
3        int m = grid.length, n=grid[0].length;
4        boolean[][] vis = new boolean[m][n];
5        int r =0,c =0;
6        vis[r][c] = true;
7        while(true){
8            int nr = r, nc=c;
9            char d = grid[r][c];
10            if(d == 'L') nc--;
11            else if (d == 'R') nc++;
12            else if(d == 'U') nr--;
13            else if (d == 'D') nr++;
14
15            if(nr < 0 || nr >= m || nc < 0 || nc >= n || vis[nr][nc]){
16                return new int[]{r, c};
17            }
18            r = nr;
19            c = nc;
20            vis[r][c] = true;
21        }
22        
23        
24    }
25}