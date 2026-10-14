// Last updated: 14/10/2026, 18:39:57
1
2class KthLargest {
3    PriorityQueue<Integer> pq;
4    int k;
5
6    public KthLargest(int k, int[] nums) {
7        this.k = k;
8        pq = new PriorityQueue<>();
9
10        for (int n : nums) {
11            pq.offer(n);
12
13            if (pq.size() > k) {
14                pq.poll();
15            }
16        }
17    }
18
19    public int add(int val) {
20        pq.offer(val);
21
22        if (pq.size() > k) {
23            pq.poll();
24        }
25
26        return pq.peek();
27    }
28}
29
30/**
31 * Your KthLargest object will be instantiated and called as such:
32 * KthLargest obj = new KthLargest(k, nums);
33 * int param_1 = obj.add(val);
34 */