// Last updated: 30/09/2026, 12:38:23
1class Solution {
2    public char findTheDifference(String s, String t) {
3        int ans = 0;
4
5        for (char c : s.toCharArray())
6            ans ^= c;
7
8        for (char c : t.toCharArray())
9            ans ^= c;
10
11        return (char) ans;
12    }
13}