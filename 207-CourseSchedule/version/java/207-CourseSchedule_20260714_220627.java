// Last updated: 14/07/2026, 22:06:27
1class Solution {
2    public String[] reorderLogFiles(String[] logs) {
3
4        Arrays.sort(logs, (a, b) -> {
5            String[] s1 = a.split(" ", 2);
6            String[] s2 = b.split(" ", 2);
7
8            boolean d1 = Character.isDigit(s1[1].charAt(0));
9            boolean d2 = Character.isDigit(s2[1].charAt(0));
10
11            if (!d1 && !d2) {
12                int cmp = s1[1].compareTo(s2[1]);
13                if (cmp != 0)
14                    return cmp;
15                return s1[0].compareTo(s2[0]);
16            }
17
18            if (!d1) return -1;
19            if (!d2) return 1;
20            return 0;
21        });
22
23        return logs;
24    }
25}