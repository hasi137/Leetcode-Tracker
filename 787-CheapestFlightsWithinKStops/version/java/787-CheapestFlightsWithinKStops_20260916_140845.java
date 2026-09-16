// Last updated: 16/09/2026, 14:08:45
1class Solution {
2    public String reorganizeString(String s) {
3        int[] count = new int[26];
4
5        for (char c : s.toCharArray())
6            count[c - 'a']++;
7
8        int max = 0;
9
10        for (int i = 0; i < 26; i++)
11            max = Math.max(max, count[i]);
12
13        if (max > (s.length() + 1) / 2)
14            return "";
15
16        StringBuilder ans = new StringBuilder();
17
18        while (ans.length() < s.length()) {
19            int first = -1;
20            int second = -1;
21
22            for (int i = 0; i < 26; i++) {
23                if (count[i] > 0 && (first == -1 || count[i] > count[first]))
24                    first = i;
25            }
26
27            for (int i = 0; i < 26; i++) {
28                if (count[i] > 0 && i != first &&
29                    (second == -1 || count[i] > count[second]))
30                    second = i;
31            }
32
33            if (second == -1) {
34                ans.append((char)(first + 'a'));
35                count[first]--;
36            } else {
37                ans.append((char)(first + 'a'));
38                ans.append((char)(second + 'a'));
39
40                count[first]--;
41                count[second]--;
42            }
43        }
44
45        return ans.toString();
46    }
47}