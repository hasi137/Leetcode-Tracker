// Last updated: 22/09/2026, 10:21:46
1class Solution {
2    public int countRangeSum(int[] nums, int lower, int upper) {
3        long[] sum = new long[nums.length + 1];
4
5        for (int i = 0; i < nums.length; i++)
6            sum[i + 1] = sum[i] + nums[i];
7
8        return mergeSort(sum, 0, sum.length - 1, lower, upper);
9    }
10
11    int mergeSort(long[] sum, int left, int right, int lower, int upper) {
12        if (left >= right)
13            return 0;
14
15        int mid = (left + right) / 2;
16        int ans = 0;
17
18        ans += mergeSort(sum, left, mid, lower, upper);
19        ans += mergeSort(sum, mid + 1, right, lower, upper);
20
21        int j = mid + 1;
22        int k = mid + 1;
23
24        for (int i = left; i <= mid; i++) {
25            while (j <= right && sum[j] - sum[i] < lower)
26                j++;
27
28            while (k <= right && sum[k] - sum[i] <= upper)
29                k++;
30
31            ans += k - j;
32        }
33
34        long[] temp = new long[right - left + 1];
35        int i = left;
36        int p = mid + 1;
37        int t = 0;
38
39        while (i <= mid && p <= right) {
40            if (sum[i] <= sum[p])
41                temp[t++] = sum[i++];
42            else
43                temp[t++] = sum[p++];
44        }
45
46        while (i <= mid)
47            temp[t++] = sum[i++];
48
49        while (p <= right)
50            temp[t++] = sum[p++];
51
52        for (i = left; i <= right; i++)
53            sum[i] = temp[i - left];
54
55        return ans;
56    }
57}