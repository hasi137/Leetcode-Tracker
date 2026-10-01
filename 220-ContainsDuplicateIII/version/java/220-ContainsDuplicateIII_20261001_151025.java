// Last updated: 01/10/2026, 15:10:25
1import java.util.*;
2
3class Solution {
4    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
5
6        TreeSet<Long> set = new TreeSet<>();
7
8        for (int i = 0; i < nums.length; i++) {
9
10            long x = nums[i];
11
12            Long bigger = set.ceiling(x - valueDiff);
13
14            if (bigger != null && bigger <= x + valueDiff) {
15                return true;
16            }
17
18            set.add(x);
19
20            if (set.size() > indexDiff) {
21                set.remove((long) nums[i - indexDiff]);
22            }
23        }
24
25        return false;
26    }
27}