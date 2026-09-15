// Last updated: 15/09/2026, 14:52:00
1import java.util.*;
2
3class Solution {
4    public long shadowPairs(int[] nums) {
5        int n = nums.length;
6        long ans = 0;
7
8        // Find first smaller element on the right
9        int[] next = new int[n];
10        Stack<Integer> st = new Stack<>();
11
12        for (int i = n - 1; i >= 0; i--) {
13            while (!st.empty() && nums[st.peek()] >= nums[i])
14                st.pop();
15
16            next[i] = st.empty() ? n : st.peek();
17            st.push(i);
18        }
19
20        // Sort indices by value
21        Integer[] idx = new Integer[n];
22        for (int i = 0; i < n; i++)
23            idx[i] = i;
24
25        Arrays.sort(idx, (a, b) -> Integer.compare(nums[b], nums[a]));
26
27        // Fenwick tree
28        int[] bit = new int[n + 1];
29
30        int p = 0;
31
32        while (p < n) {
33            int q = p;
34
35            while (q < n && nums[idx[q]] == nums[idx[p]])
36                q++;
37
38            // Query only values strictly greater
39            for (int x = p; x < q; x++) {
40                int i = idx[x];
41
42                int left = i + 1;
43                int right = next[i] - 1;
44
45                if (left <= right) {
46                    ans += sum(bit, right + 1) - sum(bit, left);
47                }
48            }
49
50            // Add current value positions
51            for (int x = p; x < q; x++) {
52                int pos = idx[x] + 1;
53
54                while (pos <= n) {
55                    bit[pos]++;
56                    pos += pos & -pos;
57                }
58            }
59
60            p = q;
61        }
62
63        return ans;
64    }
65
66    int sum(int[] bit, int x) {
67        int ans = 0;
68
69        while (x > 0) {
70            ans += bit[x];
71            x -= x & -x;
72        }
73
74        return ans;
75    }
76}