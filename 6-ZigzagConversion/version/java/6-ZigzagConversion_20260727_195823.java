// Last updated: 27/07/2026, 19:58:23
1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3        List<List<Integer>> ans = new ArrayList<>();
4        backtrack(1, n, k, new ArrayList<>(), ans);
5        return ans;
6    }
7
8    void backtrack(int start, int n, int k, List<Integer> list, List<List<Integer>> ans) {
9        if (list.size() == k) {
10            ans.add(new ArrayList<>(list));
11            return;
12        }
13
14        for (int i = start; i <= n; i++) {
15            list.add(i);
16            backtrack(i + 1, n, k, list, ans);
17            list.remove(list.size() - 1);
18        }
19    }
20}