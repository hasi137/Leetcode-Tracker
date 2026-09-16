// Last updated: 16/09/2026, 14:32:39
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
16 class Solution {
17    int prev = -1;
18    int ans = Integer.MAX_VALUE;
19
20    public int getMinimumDifference(TreeNode root) {
21        inorder(root);
22        return ans;
23    }
24
25    void inorder(TreeNode root) {
26        if (root == null)
27            return;
28
29        inorder(root.left);
30
31        if (prev != -1)
32            ans = Math.min(ans, root.val - prev);
33
34        prev = root.val;
35
36        inorder(root.right);
37    }
38}