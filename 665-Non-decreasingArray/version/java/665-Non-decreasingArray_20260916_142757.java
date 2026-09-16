// Last updated: 16/09/2026, 14:27:57
1class Solution {
2    public boolean checkPossibility(int[] nums) {
3        int count = 0;
4
5        for (int i = 1; i < nums.length; i++) {
6            if (nums[i] < nums[i - 1]) {
7                count++;
8
9                if (count > 1)
10                    return false;
11
12                if (i == 1 || nums[i] >= nums[i - 2])
13                    nums[i - 1] = nums[i];
14                else
15                    nums[i] = nums[i - 1];
16            }
17        }
18
19        return true;
20    }
21}