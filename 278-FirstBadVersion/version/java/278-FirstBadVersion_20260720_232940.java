// Last updated: 20/07/2026, 23:29:40
1class Solution {
2    List<String> ans = new ArrayList<>();
3
4    public List<String> addOperators(String num, int target) {
5        dfs(num, target, 0, "", 0, 0);
6        return ans;
7    }
8
9    void dfs(String num, int target, int i, String exp, long sum, long prev) {
10        if (i == num.length()) {
11            if (sum == target) ans.add(exp);
12            return;
13        }
14
15        for (int j = i; j < num.length(); j++) {
16            if (j > i && num.charAt(i) == '0') break;
17
18            String s = num.substring(i, j + 1);
19            long cur = Long.parseLong(s);
20
21            if (i == 0) {
22                dfs(num, target, j + 1, s, cur, cur);
23            } else {
24                dfs(num, target, j + 1, exp + "+" + s, sum + cur, cur);
25                dfs(num, target, j + 1, exp + "-" + s, sum - cur, -cur);
26                dfs(num, target, j + 1, exp + "*" + s, sum - prev + prev * cur, prev * cur);
27            }
28        }
29    }
30}