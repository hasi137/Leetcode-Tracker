// Last updated: 20/10/2026, 16:36:05
1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        List<Integer> ans = new ArrayList<>();
4
5        ans.add(1);
6
7        for (int i = 1; i <= rowIndex; i++) {
8            ans.add(1);
9
10            for (int j = i - 1; j > 0; j--) {
11                ans.set(j, ans.get(j) + ans.get(j - 1));
12            }
13        }
14
15        return ans;
16    }
17}