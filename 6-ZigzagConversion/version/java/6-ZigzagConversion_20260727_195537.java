// Last updated: 27/07/2026, 19:55:37
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3
4        List<Integer> ans = new ArrayList<>();
5
6        int top = 0, bottom = matrix.length - 1;
7        int left = 0, right = matrix[0].length - 1;
8
9        while (top <= bottom && left <= right) {
10
11            for (int i = left; i <= right; i++)
12                ans.add(matrix[top][i]);
13            top++;
14
15            for (int i = top; i <= bottom; i++)
16                ans.add(matrix[i][right]);
17            right--;
18
19            if (top <= bottom) {
20                for (int i = right; i >= left; i--)
21                    ans.add(matrix[bottom][i]);
22                bottom--;
23            }
24
25            if (left <= right) {
26                for (int i = bottom; i >= top; i--)
27                    ans.add(matrix[i][left]);
28                left++;
29            }
30        }
31
32        return ans;
33    }
34}