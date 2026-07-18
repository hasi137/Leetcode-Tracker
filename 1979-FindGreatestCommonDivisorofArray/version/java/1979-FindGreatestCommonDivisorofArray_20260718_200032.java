// Last updated: 18/07/2026, 20:00:32
1class Solution {
2    public int findGCD(int[] nums) {
3        int min = nums[0], max = nums[0];
4
5        for (int n : nums) {
6            if (n < min) min = n;
7            if (n > max) max = n;
8        }
9
10        while (max != 0) {
11            int t = max;
12            max = min % max;
13            min = t;
14        }
15
16        return min;
17    }
18}