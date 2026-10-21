// Last updated: 21/10/2026, 17:55:51
1class Solution {
2    int[][][] dp;
3
4    public int removeBoxes(int[] boxes) {
5        int n = boxes.length;
6        dp = new int[n][n][n];
7        return solve(boxes, 0, n - 1, 0);
8    }
9
10    private int solve(int[] boxes, int l, int r, int k) {
11        if (l > r)
12            return 0;
13
14        if (dp[l][r][k] != 0)
15            return dp[l][r][k];
16
17        int right = r;
18        int count = k;
19
20        while (right > l && boxes[right] == boxes[right - 1]) {
21            right--;
22            count++;
23        }
24
25        int best = solve(boxes, l, right - 1, 0)
26                 + (count + 1) * (count + 1);
27
28        for (int i = l; i < right; i++) {
29            if (boxes[i] == boxes[right]) {
30                int score = solve(boxes, i + 1, right - 1, 0)
31                          + solve(boxes, l, i, count + 1);
32
33                best = Math.max(best, score);
34            }
35        }
36
37        dp[l][r][k] = best;
38        return best;
39    }
40}