// Last updated: 20/07/2026, 23:52:39
1class NumArray {
2
3    int[] bit;
4    int[] nums;
5    int n;
6
7    public NumArray(int[] nums) {
8        this.n = nums.length;
9        this.nums = nums.clone();
10        bit = new int[n + 1];
11
12        for (int i = 0; i < n; i++) {
13            add(i + 1, nums[i]);
14        }
15    }
16
17    private void add(int index, int val) {
18        while (index <= n) {
19            bit[index] += val;
20            index += index & (-index);
21        }
22    }
23
24    private int sum(int index) {
25        int res = 0;
26        while (index > 0) {
27            res += bit[index];
28            index -= index & (-index);
29        }
30        return res;
31    }
32
33    public void update(int index, int val) {
34        int diff = val - nums[index];
35        nums[index] = val;
36        add(index + 1, diff);
37    }
38
39    public int sumRange(int left, int right) {
40        return sum(right + 1) - sum(left);
41    }
42}
43/**
44 * Your NumArray object will be instantiated and called as such:
45 * NumArray obj = new NumArray(nums);
46 * obj.update(index,val);
47 * int param_2 = obj.sumRange(left,right);
48 */