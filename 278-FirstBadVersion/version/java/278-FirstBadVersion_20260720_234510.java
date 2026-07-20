// Last updated: 20/07/2026, 23:45:10
1class NumMatrix {
2
3    int[][] pre;
4
5    public NumMatrix(int[][] matrix) {
6
7        int m = matrix.length;
8        int n = matrix[0].length;
9
10        pre = new int[m + 1][n + 1];
11
12        for (int i = 1; i <= m; i++) {
13            for (int j = 1; j <= n; j++) {
14                pre[i][j] = matrix[i - 1][j - 1]
15                          + pre[i - 1][j]
16                          + pre[i][j - 1]
17                          - pre[i - 1][j - 1];
18            }
19        }
20    }
21
22    public int sumRegion(int row1, int col1, int row2, int col2) {
23
24        return pre[row2 + 1][col2 + 1]
25             - pre[row1][col2 + 1]
26             - pre[row2 + 1][col1]
27             + pre[row1][col1];
28    }
29}
30/**
31 * Your NumMatrix object will be instantiated and called as such:
32 * NumMatrix obj = new NumMatrix(matrix);
33 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
34 */