// Last updated: 15/09/2026, 15:52:18
1import java.util.*;
2
3class Solution {
4    public int findMaxLength(int[] nums) {
5        HashMap<Integer, Integer> map = new HashMap<>();
6
7        map.put(0, -1);
8
9        int sum = 0;
10        int ans = 0;
11
12        for (int i = 0; i < nums.length; i++) {
13            if (nums[i] == 0)
14                sum--;
15            else
16                sum++;
17
18            if (map.containsKey(sum))
19                ans = Math.max(ans, i - map.get(sum));
20            else
21                map.put(sum, i);
22        }
23
24        return ans;
25    }
26}