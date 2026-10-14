// Last updated: 14/10/2026, 18:39:15
1
2class Solution {
3    public List<Integer> findClosestElements(int[] arr, int k, int x) {
4        int left = 0;
5        int right = arr.length - k;
6
7        while (left < right) {
8            int mid = left + (right - left) / 2;
9
10            if (x - arr[mid] > arr[mid + k] - x) {
11                left = mid + 1;
12            } else {
13                right = mid;
14            }
15        }
16
17        List<Integer> ans = new ArrayList<>();
18
19        for (int i = left; i < left + k; i++) {
20            ans.add(arr[i]);
21        }
22
23        return ans;
24    }
25}
26