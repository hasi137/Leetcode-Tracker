// Last updated: 14/10/2026, 18:38:26
1
2class Solution {
3    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
4        List<List<Integer>> ans = new ArrayList<>();
5
6        PriorityQueue<int[]> pq = new PriorityQueue<>(
7            (a, b) -> Integer.compare(a[0], b[0])
8        );
9
10        for (int i = 0; i < Math.min(k, nums1.length); i++) {
11            pq.offer(new int[]{nums1[i] + nums2[0], i, 0});
12        }
13
14        while (!pq.isEmpty() && ans.size() < k) {
15            int[] cur = pq.poll();
16
17            int i = cur[1];
18            int j = cur[2];
19
20            ans.add(Arrays.asList(nums1[i], nums2[j]));
21
22            if (j + 1 < nums2.length) {
23                pq.offer(new int[]{
24                    nums1[i] + nums2[j + 1], i, j + 1
25                });
26            }
27        }
28
29        return ans;
30    }
31}
32