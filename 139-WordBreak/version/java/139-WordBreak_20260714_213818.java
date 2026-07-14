// Last updated: 14/07/2026, 21:38:18
1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3        HashSet<String> set = new HashSet<>(wordDict);
4        boolean[] dp = new boolean[s.length() + 1];
5        dp[0] = true;
6
7        for (int i = 1; i <= s.length(); i++) {
8            for (int j = 0; j < i; j++) {
9                if (dp[j] && set.contains(s.substring(j, i))) {
10                    dp[i] = true;
11                    break;
12                }
13            }
14        }
15
16        return dp[s.length()];
17    }
18}