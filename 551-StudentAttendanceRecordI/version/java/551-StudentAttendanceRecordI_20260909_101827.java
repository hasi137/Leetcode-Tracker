// Last updated: 09/09/2026, 10:18:27
1class Solution {
2    public int nextGreaterElement(int n) {
3
4        char[] a = String.valueOf(n).toCharArray();
5
6        int i = a.length - 2;
7        while (i >= 0 && a[i] >= a[i + 1])
8            i--;
9
10        if (i < 0)
11            return -1;
12
13        int j = a.length - 1;
14
15        while (a[j] <= a[i])
16            j--;
17
18        char temp = a[i];
19        a[i] = a[j];
20        a[j] = temp;
21
22        int left = i + 1, right = a.length - 1;
23
24        while (left < right) {
25            temp = a[left];
26            a[left] = a[right];
27            a[right] = temp;
28            left++;
29            right--;
30        }
31
32        long ans = Long.parseLong(new String(a));
33
34        if (ans > Integer.MAX_VALUE)
35            return -1;
36
37        return (int) ans;
38    }
39}