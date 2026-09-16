// Last updated: 16/09/2026, 14:05:46
1import java.util.*;
2
3class Solution {
4    public int numMatchingSubseq(String s, String[] words) {
5        int n = s.length();
6
7        int[][] next = new int[n + 1][26];
8
9        for (int j = 0; j < 26; j++)
10            next[n][j] = n;
11
12        for (int i = n - 1; i >= 0; i--) {
13            for (int j = 0; j < 26; j++)
14                next[i][j] = next[i + 1][j];
15
16            next[i][s.charAt(i) - 'a'] = i;
17        }
18
19        HashMap<String, Boolean> map = new HashMap<>();
20        int ans = 0;
21
22        for (String word : words) {
23            if (map.containsKey(word)) {
24                if (map.get(word))
25                    ans++;
26                continue;
27            }
28
29            int pos = 0;
30            boolean ok = true;
31
32            for (char c : word.toCharArray()) {
33                int p = next[pos][c - 'a'];
34
35                if (p == n) {
36                    ok = false;
37                    break;
38                }
39
40                pos = p + 1;
41            }
42
43            map.put(word, ok);
44
45            if (ok)
46                ans++;
47        }
48
49        return ans;
50    }
51}