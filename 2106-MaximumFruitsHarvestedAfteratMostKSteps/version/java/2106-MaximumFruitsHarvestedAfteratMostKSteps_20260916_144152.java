// Last updated: 16/09/2026, 14:41:52
1class Solution {
2    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
3        int n = fruits.length;
4        int left = 0;
5        int sum = 0;
6        int ans = 0;
7
8        for (int right = 0; right < n; right++) {
9            sum += fruits[right][1];
10
11            while (left <= right && !canReach(fruits[left][0], fruits[right][0], startPos, k)) {
12                sum -= fruits[left][1];
13                left++;
14            }
15
16            ans = Math.max(ans, sum);
17        }
18
19        return ans;
20    }
21
22    boolean canReach(int left, int right, int start, int k) {
23        if (right < start)
24            return start - left <= k;
25
26        if (left > start)
27            return right - start <= k;
28
29        int a = start - left;
30        int b = right - start;
31
32        return Math.min(a, b) * 2 + Math.max(a, b) <= k;
33    }
34}