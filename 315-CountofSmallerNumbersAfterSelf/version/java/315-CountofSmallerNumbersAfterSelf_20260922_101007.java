// Last updated: 22/09/2026, 10:10:07
1class Solution {
2    public List<Integer> countSmaller(int[] nums) {
3        int n = nums.length;
4        int[] index = new int[n];
5        int[] count = new int[n];
6        
7        for (int i = 0; i < n; i++)
8            index[i] = i;
9        
10        mergeSort(nums, index, count, 0, n - 1);
11        
12        List<Integer> ans = new ArrayList<>();
13        for (int x : count)
14            ans.add(x);
15        
16        return ans;
17    }
18
19    void mergeSort(int[] nums, int[] index, int[] count, int left, int right) {
20        if (left >= right)
21            return;
22        
23        int mid = (left + right) / 2;
24        
25        mergeSort(nums, index, count, left, mid);
26        mergeSort(nums, index, count, mid + 1, right);
27        
28        int i = left;
29        int j = mid + 1;
30        int k = 0;
31        int[] temp = new int[right - left + 1];
32        
33        while (i <= mid && j <= right) {
34            if (nums[index[j]] < nums[index[i]]) {
35                temp[k++] = index[j++];
36            } else {
37                count[index[i]] += j - (mid + 1);
38                temp[k++] = index[i++];
39            }
40        }
41        
42        while (i <= mid) {
43            count[index[i]] += j - (mid + 1);
44            temp[k++] = index[i++];
45        }
46        
47        while (j <= right)
48            temp[k++] = index[j++];
49        
50        for (i = left; i <= right; i++)
51            index[i] = temp[i - left];
52    }
53}