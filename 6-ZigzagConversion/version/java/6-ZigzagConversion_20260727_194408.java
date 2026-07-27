// Last updated: 27/07/2026, 19:44:08
1class Solution {
2    public String convert(String s, int numRows) {
3
4        if (numRows == 1 || s.length() <= numRows)
5            return s;
6
7        StringBuilder[] rows = new StringBuilder[numRows];
8
9        for (int i = 0; i < numRows; i++)
10            rows[i] = new StringBuilder();
11
12        int row = 0;
13        boolean down = true;
14
15        for (char ch : s.toCharArray()) {
16            rows[row].append(ch);
17
18            if (row == 0)
19                down = true;
20            else if (row == numRows - 1)
21                down = false;
22
23            if (down)
24                row++;
25            else
26                row--;
27        }
28
29        StringBuilder ans = new StringBuilder();
30
31        for (StringBuilder r : rows)
32            ans.append(r);
33
34        return ans.toString();
35    }
36}