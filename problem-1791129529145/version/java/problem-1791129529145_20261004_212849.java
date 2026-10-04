// Last updated: 04/10/2026, 21:28:49
1class Solution {
2    public int minimumPairRemoval(int[] nums) {
3        int count = 0;
4
5        while (true) {
6            boolean sorted = true;
7
8            for (int i = 0; i < nums.length - 1; i++) {
9                if (nums[i] > nums[i + 1]) {
10                    sorted = false;
11                    break;
12                }
13            }
14
15            if (sorted) {
16                return count;
17            }
18
19            int index = 0;
20            int minSum = nums[0] + nums[1];
21
22            for (int i = 1; i < nums.length - 1; i++) {
23                int sum = nums[i] + nums[i + 1];
24
25                if (sum < minSum) {
26                    minSum = sum;
27                    index = i;
28                }
29            }
30
31            nums[index] = minSum;
32
33            for (int i = index + 1; i < nums.length - 1; i++) {
34                nums[i] = nums[i + 1];
35            }
36
37            nums = java.util.Arrays.copyOf(nums, nums.length - 1);
38            count++;
39        }
40    }
41}