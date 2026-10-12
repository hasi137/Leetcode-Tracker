// Last updated: 12/10/2026, 17:52:07
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
16
17class Solution {
18    public TreeNode addOneRow(TreeNode root, int val, int depth) {
19        if (depth == 1) {
20            TreeNode node = new TreeNode(val);
21            node.left = root;
22            return node;
23        }
24
25        if (root == null) return null;
26
27        if (depth == 2) {
28            TreeNode left = new TreeNode(val);
29            TreeNode right = new TreeNode(val);
30
31            left.left = root.left;
32            right.right = root.right;
33
34            root.left = left;
35            root.right = right;
36
37            return root;
38        }
39
40        root.left = addOneRow(root.left, val, depth - 1);
41        root.right = addOneRow(root.right, val, depth - 1);
42
43        return root;
44    }
45}
46