// Last updated: 20/07/2026, 23:44:02
1class NumArray {
2
3    int[] prefix;
4
5    public NumArray(int[] nums) {
6
7        prefix = new int[nums.length + 1];
8
9        for (int i = 0; i < nums.length; i++) {
10            prefix[i + 1] = prefix[i] + nums[i];
11        }
12    }
13
14    public int sumRange(int left, int right) {
15
16        return prefix[right + 1] - prefix[left];
17    }
18}
19
20/**
21 * Your NumArray object will be instantiated and called as such:
22 * NumArray obj = new NumArray(nums);
23 * int param_1 = obj.sumRange(left,right);
24 */