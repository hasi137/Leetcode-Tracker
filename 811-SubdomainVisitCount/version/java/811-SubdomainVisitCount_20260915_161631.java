// Last updated: 15/09/2026, 16:16:31
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        if (s1.length() > s2.length())
4            return false;
5
6        int[] a = new int[26];
7        int[] b = new int[26];
8
9        for (int i = 0; i < s1.length(); i++) {
10            a[s1.charAt(i) - 'a']++;
11            b[s2.charAt(i) - 'a']++;
12        }
13
14        for (int i = s1.length(); i < s2.length(); i++) {
15            if (check(a, b))
16                return true;
17
18            b[s2.charAt(i) - 'a']++;
19            b[s2.charAt(i - s1.length()) - 'a']--;
20        }
21
22        return check(a, b);
23    }
24
25    boolean check(int[] a, int[] b) {
26        for (int i = 0; i < 26; i++) {
27            if (a[i] != b[i])
28                return false;
29        }
30        return true;
31    }
32}