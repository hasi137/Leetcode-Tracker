// Last updated: 08/10/2026, 09:13:42
1class Solution {
2    public List<Integer> largestDivisibleSubset(int[] nums) {
3        Arrays.sort(nums);
4        int n = nums.length, best = 0;
5        int[] dp = new int[n], prev = new int[n];
6        Arrays.fill(dp, 1);
7        Arrays.fill(prev, -1);
8
9        for (int i = 0; i < n; i++)
10            for (int j = 0; j < i; j++)
11                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
12                    dp[i] = dp[j] + 1;
13                    prev[i] = j;
14                }
15
16        for (int i = 1; i < n; i++)
17            if (dp[i] > dp[best]) best = i;
18
19        List<Integer> ans = new ArrayList<>();
20        while (best != -1) {
21            ans.add(nums[best]);
22            best = prev[best];
23        }
24        return ans;
25    }
26}