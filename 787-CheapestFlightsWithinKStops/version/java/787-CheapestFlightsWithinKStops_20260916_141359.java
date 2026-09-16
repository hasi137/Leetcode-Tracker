// Last updated: 16/09/2026, 14:13:59
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        if (k <= 1)
4            return 0;
5
6        int left = 0;
7        int product = 1;
8        int ans = 0;
9
10        for (int right = 0; right < nums.length; right++) {
11            product *= nums[right];
12
13            while (product >= k) {
14                product /= nums[left];
15                left++;
16            }
17
18            ans += right - left + 1;
19        }
20
21        return ans;
22    }
23}