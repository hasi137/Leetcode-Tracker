// Last updated: 16/09/2026, 14:33:44
1class Solution {
2    public String convertToBase7(int num) {
3        if (num == 0)
4            return "0";
5
6        boolean neg = num < 0;
7
8        if (neg)
9            num = -num;
10
11        String ans = "";
12
13        while (num > 0) {
14            ans = (num % 7) + ans;
15            num = num / 7;
16        }
17
18        if (neg)
19            ans = "-" + ans;
20
21        return ans;
22    }
23}