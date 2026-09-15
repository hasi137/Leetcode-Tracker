// Last updated: 15/09/2026, 16:03:48
1import java.util.*;
2
3class Solution {
4    public int findPairs(int[] nums, int k) {
5        HashSet<Integer> set = new HashSet<>();
6        HashSet<Integer> used = new HashSet<>();
7
8        int ans = 0;
9
10        for (int x : nums) {
11            if (set.contains(x - k) && !used.contains(x - k)) {
12                ans++;
13                used.add(x - k);
14            }
15
16            if (set.contains(x + k) && !used.contains(x)) {
17                ans++;
18                used.add(x);
19            }
20
21            set.add(x);
22        }
23
24        return ans;
25    }
26}