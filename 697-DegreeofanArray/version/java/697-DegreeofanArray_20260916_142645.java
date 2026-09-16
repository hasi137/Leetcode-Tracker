// Last updated: 16/09/2026, 14:26:45
1class Solution {
2    public int findShortestSubArray(int[] nums) {
3        int[] count = new int[50000];
4        int[] first = new int[50000];
5        int[] last = new int[50000];
6
7        for (int i = 0; i < nums.length; i++) {
8            if (count[nums[i]] == 0)
9                first[nums[i]] = i;
10
11            count[nums[i]]++;
12            last[nums[i]] = i;
13        }
14
15        int degree = 0;
16
17        for (int i = 0; i < 50000; i++)
18            degree = Math.max(degree, count[i]);
19
20        int ans = nums.length;
21
22        for (int i = 0; i < 50000; i++) {
23            if (count[i] == degree) {
24                ans = Math.min(ans, last[i] - first[i] + 1);
25            }
26        }
27
28        return ans;
29    }
30}