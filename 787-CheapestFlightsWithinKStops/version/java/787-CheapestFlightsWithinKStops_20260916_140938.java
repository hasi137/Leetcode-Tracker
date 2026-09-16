// Last updated: 16/09/2026, 14:09:38
1import java.util.*;
2
3class Solution {
4    public List<Integer> partitionLabels(String s) {
5        int[] last = new int[26];
6
7        for (int i = 0; i < s.length(); i++)
8            last[s.charAt(i) - 'a'] = i;
9
10        List<Integer> ans = new ArrayList<>();
11
12        int end = 0;
13        int start = 0;
14
15        for (int i = 0; i < s.length(); i++) {
16            end = Math.max(end, last[s.charAt(i) - 'a']);
17
18            if (i == end) {
19                ans.add(end - start + 1);
20                start = i + 1;
21            }
22        }
23
24        return ans;
25    }
26}