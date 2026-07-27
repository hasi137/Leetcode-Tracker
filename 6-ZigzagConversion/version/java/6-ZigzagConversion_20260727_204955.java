// Last updated: 27/07/2026, 20:49:55
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
17    TreeNode first, second, prev;
18
19    public void recoverTree(TreeNode root) {
20        prev = new TreeNode(Integer.MIN_VALUE);
21        inorder(root);
22
23        int temp = first.val;
24        first.val = second.val;
25        second.val = temp;
26    }
27
28    void inorder(TreeNode root) {
29        if (root == null) return;
30
31        inorder(root.left);
32
33        if (prev.val > root.val) {
34            if (first == null) first = prev;
35            second = root;
36        }
37        prev = root;
38
39        inorder(root.right);
40    }
41}