// Last updated: 20/07/2026, 23:31:31
1class Solution {
2    public void gameOfLife(int[][] board) {
3
4        int m = board.length;
5        int n = board[0].length;
6
7        int[][] temp = new int[m][n];
8
9        int[] dr = {-1,-1,-1,0,0,1,1,1};
10        int[] dc = {-1,0,1,-1,1,-1,0,1};
11
12        for (int i = 0; i < m; i++) {
13            for (int j = 0; j < n; j++) {
14
15                int live = 0;
16
17                for (int k = 0; k < 8; k++) {
18                    int r = i + dr[k];
19                    int c = j + dc[k];
20
21                    if (r >= 0 && r < m && c >= 0 && c < n && board[r][c] == 1)
22                        live++;
23                }
24
25                if (board[i][j] == 1) {
26                    if (live == 2 || live == 3)
27                        temp[i][j] = 1;
28                    else
29                        temp[i][j] = 0;
30                } else {
31                    if (live == 3)
32                        temp[i][j] = 1;
33                    else
34                        temp[i][j] = 0;
35                }
36            }
37        }
38
39        for (int i = 0; i < m; i++) {
40            for (int j = 0; j < n; j++) {
41                board[i][j] = temp[i][j];
42            }
43        }
44    }
45}