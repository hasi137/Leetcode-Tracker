// Last updated: 20/07/2026, 23:36:10
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3
4        String[] words = s.split(" ");
5
6        if (pattern.length() != words.length)
7            return false;
8
9        HashMap<Character, String> map1 = new HashMap<>();
10        HashMap<String, Character> map2 = new HashMap<>();
11
12        for (int i = 0; i < pattern.length(); i++) {
13
14            char ch = pattern.charAt(i);
15            String word = words[i];
16
17            if (map1.containsKey(ch)) {
18                if (!map1.get(ch).equals(word))
19                    return false;
20            } else {
21                map1.put(ch, word);
22            }
23
24            if (map2.containsKey(word)) {
25                if (map2.get(word) != ch)
26                    return false;
27            } else {
28                map2.put(word, ch);
29            }
30        }
31
32        return true;
33    }
34}