// Last updated: 09/09/2026, 10:10:43
1import java.util.*;
2
3class Solution {
4    public String[] findWords(String[] words) {
5        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
6        List<String> ans = new ArrayList<>();
7
8        for (String w : words) {
9            String s = w.toLowerCase();
10
11            for (String row : rows) {
12                boolean ok = true;
13
14                for (char c : s.toCharArray()) {
15                    if (row.indexOf(c) == -1) {
16                        ok = false;
17                        break;
18                    }
19                }
20
21                if (ok) {
22                    ans.add(w);
23                    break;
24                }
25            }
26        }
27
28        return ans.toArray(new String[0]);
29    }
30}