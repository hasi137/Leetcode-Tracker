// Last updated: 01/10/2026, 15:12:25
1import java.util.*;
2
3class Solution {
4    public List<Integer> findDuplicates(int[] nums) {
5
6        List<Integer> ans = new ArrayList<>();
7
8        for (int i = 0; i < nums.length; i++) {
9
10            int x = Math.abs(nums[i]);
11
12            if (nums[x - 1] < 0) {
13                ans.add(x);
14            } else {
15                nums[x - 1] = -nums[x - 1];
16            }
17        }
18
19        return ans;
20    }
21}