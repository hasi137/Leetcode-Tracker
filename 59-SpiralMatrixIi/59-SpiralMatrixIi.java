// Last updated: 11/07/2026, 12:39:50
class Solution {
    public int[][] generateMatrix(int n) {

        int[][] a = new int[n][n];

        int r1 = 0, r2 = n - 1;
        int c1 = 0, c2 = n - 1;
        int x = 1;

        while (r1 <= r2 && c1 <= c2) {

            for (int i = c1; i <= c2; i++)
                a[r1][i] = x++;
            r1++;

            for (int i = r1; i <= r2; i++)
                a[i][c2] = x++;
            c2--;

            for (int i = c2; i >= c1 && r1 <= r2; i--)
                a[r2][i] = x++;
            r2--;

            for (int i = r2; i >= r1 && c1 <= c2; i--)
                a[i][c1] = x++;
            c1++;
        }

        return a;
    }
}