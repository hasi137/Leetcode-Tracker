// Last updated: 01/10/2026, 15:21:47
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> minimumAbsDifference(int[] arr) {
5        Arrays.sort(arr);
6
7        int min = Integer.MAX_VALUE;
8        List<List<Integer>> ans = new ArrayList<>();
9
10        for (int i = 1; i < arr.length; i++) {
11            int diff = arr[i] - arr[i - 1];
12
13            if (diff < min) {
14                min = diff;
15                ans.clear();
16                ans.add(Arrays.asList(arr[i - 1], arr[i]));
17            } 
18            else if (diff == min) {
19                ans.add(Arrays.asList(arr[i - 1], arr[i]));
20            }
21        }
22
23        return ans;
24    }
25}