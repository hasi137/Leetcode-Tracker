// Last updated: 16/09/2026, 14:11:40
1import java.util.*;
2
3class Solution {
4    public int openLock(String[] deadends, String target) {
5        HashSet<String> dead = new HashSet<>();
6
7        for (String s : deadends)
8            dead.add(s);
9
10        if (dead.contains("0000"))
11            return -1;
12
13        Queue<String> q = new LinkedList<>();
14        HashSet<String> visited = new HashSet<>();
15
16        q.add("0000");
17        visited.add("0000");
18
19        int steps = 0;
20
21        while (!q.isEmpty()) {
22            int size = q.size();
23
24            for (int x = 0; x < size; x++) {
25                String cur = q.poll();
26
27                if (cur.equals(target))
28                    return steps;
29
30                for (int i = 0; i < 4; i++) {
31                    char[] a = cur.toCharArray();
32
33                    a[i] = a[i] == '9' ? '0' : (char)(a[i] + 1);
34                    String next = new String(a);
35
36                    if (!dead.contains(next) && !visited.contains(next)) {
37                        visited.add(next);
38                        q.add(next);
39                    }
40
41                    a[i] = cur.charAt(i) == '0' ? '9' : (char)(cur.charAt(i) - 1);
42                    next = new String(a);
43
44                    if (!dead.contains(next) && !visited.contains(next)) {
45                        visited.add(next);
46                        q.add(next);
47                    }
48                }
49            }
50
51            steps++;
52        }
53
54        return -1;
55    }
56}