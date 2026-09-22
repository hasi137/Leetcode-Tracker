// Last updated: 22/09/2026, 10:18:03
1class Solution {
2    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
3        int[] ans = new int[k];
4
5        int start = Math.max(0, k - nums2.length);
6        int end = Math.min(k, nums1.length);
7
8        for (int i = start; i <= end; i++) {
9            int[] a = getMax(nums1, i);
10            int[] b = getMax(nums2, k - i);
11
12            int[] cur = merge(a, b);
13
14            if (greater(cur, 0, ans, 0))
15                ans = cur;
16        }
17
18        return ans;
19    }
20
21    public int[] getMax(int[] nums, int k) {
22        int[] stack = new int[k];
23        int top = 0;
24        int remove = nums.length - k;
25
26        for (int x : nums) {
27            while (top > 0 && remove > 0 && stack[top - 1] < x) {
28                top--;
29                remove--;
30            }
31
32            if (top < k)
33                stack[top++] = x;
34            else
35                remove--;
36        }
37
38        return stack;
39    }
40
41    public int[] merge(int[] a, int[] b) {
42        int[] ans = new int[a.length + b.length];
43        int i = 0;
44        int j = 0;
45        int k = 0;
46
47        while (i < a.length || j < b.length) {
48            if (greater(a, i, b, j))
49                ans[k++] = a[i++];
50            else
51                ans[k++] = b[j++];
52        }
53
54        return ans;
55    }
56
57    public boolean greater(int[] a, int i, int[] b, int j) {
58        while (i < a.length && j < b.length && a[i] == b[j]) {
59            i++;
60            j++;
61        }
62
63        if (j == b.length)
64            return true;
65
66        if (i == a.length)
67            return false;
68
69        return a[i] > b[j];
70    }
71}