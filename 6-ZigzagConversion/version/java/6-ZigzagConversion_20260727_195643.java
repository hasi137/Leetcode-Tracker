// Last updated: 27/07/2026, 19:56:43
1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3
4        List<int[]> ans = new ArrayList<>();
5        int i = 0, n = intervals.length;
6
7        while (i < n && intervals[i][1] < newInterval[0])
8            ans.add(intervals[i++]);
9
10        while (i < n && intervals[i][0] <= newInterval[1]) {
11            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
12            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
13            i++;
14        }
15
16        ans.add(newInterval);
17
18        while (i < n)
19            ans.add(intervals[i++]);
20
21        return ans.toArray(new int[ans.size()][]);
22    }
23}