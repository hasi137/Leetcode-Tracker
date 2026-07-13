// Last updated: 13/07/2026, 20:10:44
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        Map<Integer, Integer> freqMap = new HashMap<>();
4        for (int num : nums) {
5            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
6        }
7        List<Integer>[] bucket = new ArrayList[nums.length + 1];
8
9        for (int key : freqMap.keySet()) {
10            int freq = freqMap.get(key);
11            if (bucket[freq] == null) {
12                bucket[freq] = new ArrayList<>();
13            }
14            bucket[freq].add(key);
15        }
16
17        int[] result = new int[k];
18        int index = 0;
19
20        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {
21            if (bucket[i] != null) {
22                for (int num : bucket[i]) {
23                    result[index++] = num;
24                    if (index == k) {
25                        break;
26                    }
27                }
28            }
29        }
30
31        return result;
32    }
33}