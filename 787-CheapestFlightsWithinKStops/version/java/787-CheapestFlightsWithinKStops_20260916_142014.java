// Last updated: 16/09/2026, 14:20:14
1import java.util.*;
2
3class Solution {
4    public int triangleNumber(int[] nums) {
5        Arrays.sort(nums);
6
7        int ans = 0;
8
9        for (int k = nums.length - 1; k >= 2; k--) {
10            int i = 0;
11            int j = k - 1;
12
13            while (i < j) {
14                if (nums[i] + nums[j] > nums[k]) {
15                    ans += j - i;
16                    j--;
17                } else {
18                    i++;
19                }
20            }
21        }
22
23        return ans;
24    }
25}