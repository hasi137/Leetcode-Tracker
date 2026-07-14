// Last updated: 14/07/2026, 22:04:57
1class Solution {
2
3    List<List<String>> ans = new ArrayList<>();
4
5    public List<List<String>> partition(String s) {
6        backtrack(s, 0, new ArrayList<>());
7        return ans;
8    }
9
10    private void backtrack(String s, int start, List<String> list) {
11        if (start == s.length()) {
12            ans.add(new ArrayList<>(list));
13            return;
14        }
15
16        for (int end = start; end < s.length(); end++) {
17            if (isPalindrome(s, start, end)) {
18                list.add(s.substring(start, end + 1));
19                backtrack(s, end + 1, list);
20                list.remove(list.size() - 1);
21            }
22        }
23    }
24
25    private boolean isPalindrome(String s, int l, int r) {
26        while (l < r) {
27            if (s.charAt(l) != s.charAt(r))
28                return false;
29            l++;
30            r--;
31        }
32        return true;
33    }
34}