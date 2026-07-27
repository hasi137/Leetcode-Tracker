// Last updated: 27/07/2026, 19:52:43
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
5
6        Arrays.sort(candidates);
7        List<List<Integer>> ans = new ArrayList<>();
8        solve(candidates, target, 0, new ArrayList<>(), ans);
9        return ans;
10    }
11
12    void solve(int[] a, int target, int start, List<Integer> list, List<List<Integer>> ans) {
13
14        if (target == 0) {
15            ans.add(new ArrayList<>(list));
16            return;
17        }
18
19        for (int i = start; i < a.length; i++) {
20
21            if (i > start && a[i] == a[i - 1])
22                continue;
23
24            if (a[i] > target)
25                break;
26
27            list.add(a[i]);
28            solve(a, target - a[i], i + 1, list, ans);
29            list.remove(list.size() - 1);
30        }
31    }
32}