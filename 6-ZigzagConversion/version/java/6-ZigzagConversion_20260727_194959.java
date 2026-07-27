// Last updated: 27/07/2026, 19:49:59
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        return new int[]{find(nums, target, true), find(nums, target, false)};
4    }
5
6    int find(int[] nums, int target, boolean first) {
7        int l = 0, r = nums.length - 1, ans = -1;
8
9        while (l <= r) {
10            int m = (l + r) / 2;
11
12            if (nums[m] == target) {
13                ans = m;
14                if (first)
15                    r = m - 1;
16                else
17                    l = m + 1;
18            } else if (nums[m] < target) {
19                l = m + 1;
20            } else {
21                r = m - 1;
22            }
23        }
24
25        return ans;
26    }
27}