// Last updated: 16/09/2026, 14:31:49
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
19    public int diameterOfBinaryTree(TreeNode root) {
20        height(root);
21        return ans;
22    }
23
24    int height(TreeNode root) {
25        if (root == null)
26            return 0;
27
28        int left = height(root.left);
29        int right = height(root.right);
30
31        ans = Math.max(ans, left + right);
32
33        return Math.max(left, right) + 1;
34    }
35}