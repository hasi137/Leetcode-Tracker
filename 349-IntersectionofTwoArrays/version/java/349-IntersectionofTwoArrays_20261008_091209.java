// Last updated: 08/10/2026, 09:12:09
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashSet<Integer> set1 = new HashSet<>();
4        HashSet<Integer> result = new HashSet<>();
5
6        for (int num : nums1) {
7            set1.add(num);
8        }
9
10        for (int num : nums2) {
11            if (set1.contains(num)) {
12                result.add(num);
13            }
14        }
15
16        int[] ans = new int[result.size()];
17        int i = 0;
18
19        for (int num : result) {
20            ans[i++] = num;
21        }
22
23        return ans;
24    }
25}