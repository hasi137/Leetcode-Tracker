// Last updated: 11/07/2026, 12:31:03
class Solution {

    public long goodIntegers(long l, long r, int k) {
        return solve(r, k) - solve(l - 1, k);
    }

    long solve(long x, int k) {
        String s = x + "";
        long[][][][] dp = new long[s.length()][11][2][2];

        for (long[][][] a : dp)
            for (long[][] b : a)
                for (long[] c : b)
                    java.util.Arrays.fill(c, -1);

        return dfs(0, 10, 1, 0, s, k, dp);
    }

    long dfs(int i, int prev, int tight, int start, String s, int k, long[][][][] dp) {
        if (i == s.length()) return start;

        if (dp[i][prev][tight][start] != -1)
            return dp[i][prev][tight][start];

        int lim = (tight == 1) ? s.charAt(i) - '0' : 9;
        long res = 0;

        for (int d = 0; d <= lim; d++) {
            int nt = (tight == 1 && d == lim) ? 1 : 0;
            int ns = (start == 1 || d != 0) ? 1 : 0;

            if (ns == 0 || prev == 10 || Math.abs(prev - d) <= k)
                res += dfs(i + 1, ns == 0 ? 10 : d, nt, ns, s, k, dp);
        }

        return dp[i][prev][tight][start] = res;
    }
}