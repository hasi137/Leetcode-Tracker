// Last updated: 27/07/2026, 19:51:37
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3
4        List<List<Integer>> ans = new ArrayList<>();
5        solve(candidates, target, 0, new ArrayList<>(), ans);
6        return ans;
7    }
8
9    void solve(int[] a, int target, int i, List<Integer> list, List<List<Integer>> ans) {
10
11        if (target == 0) {
12            ans.add(new ArrayList<>(list));
13            return;
14        }
15
16        if (i == a.length || target < 0)
17            return;
18
19        list.add(a[i]);
20        solve(a, target - a[i], i, list, ans);
21
22        list.remove(list.size() - 1);
23        solve(a, target, i + 1, list, ans);
24    }
25}
26