// Last updated: 14/07/2026, 22:17:41
1class MedianFinder {
2
3    PriorityQueue<Integer> maxHeap;
4    PriorityQueue<Integer> minHeap;
5
6    public MedianFinder() {
7        maxHeap = new PriorityQueue<>((a, b) -> b - a);
8        minHeap = new PriorityQueue<>();
9    }
10
11    public void addNum(int num) {
12        maxHeap.offer(num);
13        minHeap.offer(maxHeap.poll());
14
15        if (maxHeap.size() < minHeap.size()) {
16            maxHeap.offer(minHeap.poll());
17        }
18    }
19
20    public double findMedian() {
21        if (maxHeap.size() == minHeap.size()) {
22            return (maxHeap.peek() + minHeap.peek()) / 2.0;
23        }
24        return maxHeap.peek();
25    }
26}