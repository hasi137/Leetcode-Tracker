// Last updated: 20/07/2026, 23:40:26
1class Solution {
2    public List<String> removeInvalidParentheses(String s) {
3
4        List<String> ans = new ArrayList<>();
5        Queue<String> q = new LinkedList<>();
6        Set<String> vis = new HashSet<>();
7
8        q.offer(s);
9        vis.add(s);
10
11        boolean found = false;
12
13        while (!q.isEmpty()) {
14            String cur = q.poll();
15
16            if (isValid(cur)) {
17                ans.add(cur);
18                found = true;
19            }
20
21            if (found) continue;
22
23            for (int i = 0; i < cur.length(); i++) {
24
25                if (cur.charAt(i) != '(' && cur.charAt(i) != ')')
26                    continue;
27
28                String next = cur.substring(0, i) + cur.substring(i + 1);
29
30                if (!vis.contains(next)) {
31                    vis.add(next);
32                    q.offer(next);
33                }
34            }
35        }
36
37        return ans;
38    }
39
40    boolean isValid(String s) {
41        int count = 0;
42
43        for (char c : s.toCharArray()) {
44            if (c == '(')
45                count++;
46            else if (c == ')') {
47                if (count == 0)
48                    return false;
49                count--;
50            }
51        }
52
53        return count == 0;
54    }
55}