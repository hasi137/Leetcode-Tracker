// Last updated: 13/07/2026, 20:11:56
1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while (left <= right) {
7            int mid = left + (right - left) / 2;
8
9            if (nums[mid] == target) {
10                return mid;
11            }
12
13            if (nums[left] <= nums[mid]) {
14                if (target >= nums[left] && target < nums[mid]) {
15                    right = mid - 1;
16                } else {
17                    left = mid + 1;
18                }
19            }
20            else {
21                if (target > nums[mid] && target <= nums[right]) {
22                    left = mid + 1;
23                } else {
24                    right = mid - 1;
25                }
26            }
27        }
28
29        return -1;
30    }
31}