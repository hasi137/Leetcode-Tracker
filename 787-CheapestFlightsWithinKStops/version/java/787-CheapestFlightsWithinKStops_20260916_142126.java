// Last updated: 16/09/2026, 14:21:26
1import java.util.*;
2
3class Solution {
4    public int findUnsortedSubarray(int[] nums) {
5        int[] a = nums.clone();
6        Arrays.sort(a);
7
8        int left = 0;
9        int right = nums.length - 1;
10
11        while (left < nums.length && nums[left] == a[left])
12            left++;
13
14        if (left == nums.length)
15            return 0;
16
17        while (right >= 0 && nums[right] == a[right])
18            right--;
19
20        return right - left + 1;
21    }
22}