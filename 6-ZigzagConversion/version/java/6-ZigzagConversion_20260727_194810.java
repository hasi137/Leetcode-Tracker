// Last updated: 27/07/2026, 19:48:10
1class Solution {
2    public void nextPermutation(int[] nums) {
3
4        int i = nums.length - 2;
5
6        while (i >= 0 && nums[i] >= nums[i + 1])
7            i--;
8
9        if (i >= 0) {
10            int j = nums.length - 1;
11            while (nums[j] <= nums[i])
12                j--;
13
14            int temp = nums[i];
15            nums[i] = nums[j];
16            nums[j] = temp;
17        }
18
19        int l = i + 1;
20        int r = nums.length - 1;
21
22        while (l < r) {
23            int temp = nums[l];
24            nums[l] = nums[r];
25            nums[r] = temp;
26            l++;
27            r--;
28        }
29    }
30}