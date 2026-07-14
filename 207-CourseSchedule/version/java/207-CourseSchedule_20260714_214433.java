// Last updated: 14/07/2026, 21:44:33
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>();
4
5        for (int num : nums) {
6            pq.offer(num);
7            if (pq.size() > k)
8                pq.poll();
9        }
10
11        return pq.peek();
12    }
13}