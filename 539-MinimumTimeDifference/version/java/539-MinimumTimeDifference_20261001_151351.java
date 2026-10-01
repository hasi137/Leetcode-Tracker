// Last updated: 01/10/2026, 15:13:51
1import java.util.*;
2
3class Solution {
4    public int findMinDifference(List<String> timePoints) {
5
6        List<Integer> times = new ArrayList<>();
7
8        for (String time : timePoints) {
9
10            int hour = Integer.parseInt(time.substring(0, 2));
11            int minute = Integer.parseInt(time.substring(3, 5));
12
13            times.add(hour * 60 + minute);
14        }
15
16        Collections.sort(times);
17
18        int ans = 1440 - times.get(times.size() - 1) + times.get(0);
19
20        for (int i = 1; i < times.size(); i++) {
21            ans = Math.min(ans, times.get(i) - times.get(i - 1));
22        }
23
24        return ans;
25    }
26}