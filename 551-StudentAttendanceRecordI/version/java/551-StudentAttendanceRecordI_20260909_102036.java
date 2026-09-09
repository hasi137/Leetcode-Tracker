// Last updated: 09/09/2026, 10:20:36
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
19    public int findTilt(TreeNode root) {
20        sum(root);
21        return ans;
22    }
23
24    int sum(TreeNode root) {
25        if (root == null)
26            return 0;
27
28        int left = sum(root.left);
29        int right = sum(root.right);
30
31        ans += Math.abs(left - right);
32
33        return left + right + root.val;
34    }
35}