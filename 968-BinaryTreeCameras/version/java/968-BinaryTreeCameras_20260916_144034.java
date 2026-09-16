// Last updated: 16/09/2026, 14:40:34
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int ans = 0;
18
19    public int minCameraCover(TreeNode root) {
20        if (check(root) == 0)
21            ans++;
22
23        return ans;
24    }
25
26    int check(TreeNode root) {
27        if (root == null)
28            return 1;
29
30        int left = check(root.left);
31        int right = check(root.right);
32
33        if (left == 0 || right == 0) {
34            ans++;
35            return 2;
36        }
37
38        if (left == 2 || right == 2)
39            return 1;
40
41        return 0;
42    }
43}