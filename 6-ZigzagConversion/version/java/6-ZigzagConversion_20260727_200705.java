// Last updated: 27/07/2026, 20:07:05
1class Solution {
2    public List<List<Integer>> subsetsWithDup(int[] nums) {
3        Arrays.sort(nums);
4        List<List<Integer>> ans = new ArrayList<>();
5        backtrack(0, nums, new ArrayList<>(), ans);
6        return ans;
7    }
8
9    void backtrack(int start, int[] nums, List<Integer> list, List<List<Integer>> ans) {
10        ans.add(new ArrayList<>(list));
11
12        for (int i = start; i < nums.length; i++) {
13            if (i > start && nums[i] == nums[i - 1]) continue;
14
15            list.add(nums[i]);
16            backtrack(i + 1, nums, list, ans);
17            list.remove(list.size() - 1);
18        }
19    }
20}