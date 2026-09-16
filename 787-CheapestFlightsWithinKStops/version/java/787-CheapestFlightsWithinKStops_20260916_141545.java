// Last updated: 16/09/2026, 14:15:45
1import java.util.*;
2
3class Solution {
4    public String replaceWords(List<String> dictionary, String sentence) {
5        HashSet<String> set = new HashSet<>(dictionary);
6
7        String[] words = sentence.split(" ");
8        StringBuilder ans = new StringBuilder();
9
10        for (String word : words) {
11            String root = word;
12
13            for (int i = 1; i <= word.length(); i++) {
14                String part = word.substring(0, i);
15
16                if (set.contains(part)) {
17                    root = part;
18                    break;
19                }
20            }
21
22            if (ans.length() > 0)
23                ans.append(" ");
24
25            ans.append(root);
26        }
27
28        return ans.toString();
29    }
30}