// Last updated: 22/07/2026, 23:53:45
1class Solution {
2    public int nthSuperUglyNumber(int n, int[] primes) {
3        int k = primes.length;
4        int[] dp = new int[n];
5        int[] idx = new int[k];
6
7        dp[0] = 1;
8
9        for (int i = 1; i < n; i++) {
10            long min = Long.MAX_VALUE;
11
12            for (int j = 0; j < k; j++)
13                min = Math.min(min, (long) dp[idx[j]] * primes[j]);
14
15            dp[i] = (int) min;
16
17            for (int j = 0; j < k; j++)
18                if ((long) dp[idx[j]] * primes[j] == min)
19                    idx[j]++;
20        }
21
22        return dp[n - 1];
23    }
24}