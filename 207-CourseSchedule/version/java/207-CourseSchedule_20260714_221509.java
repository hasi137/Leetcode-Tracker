// Last updated: 14/07/2026, 22:15:09
1class Solution {
2    public int leastInterval(char[] tasks, int n) {
3
4        int[] freq = new int[26];
5
6        for (char c : tasks)
7            freq[c - 'A']++;
8
9        Arrays.sort(freq);
10
11        int max = freq[25] - 1;
12        int idle = max * n;
13
14        for (int i = 24; i >= 0 && freq[i] > 0; i--) {
15            idle -= Math.min(max, freq[i]);
16        }
17
18        return idle > 0 ? tasks.length + idle : tasks.length;
19    }
20}