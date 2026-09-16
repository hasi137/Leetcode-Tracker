// Last updated: 16/09/2026, 14:30:40
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
17    public boolean findTarget(TreeNode root, int k) {
18        HashSet<Integer> set = new HashSet<>();
19        return check(root, k, set);
20    }
21
22    boolean check(TreeNode root, int k, HashSet<Integer> set) {
23        if (root == null)
24            return false;
25
26        if (set.contains(k - root.val))
27            return true;
28
29        set.add(root.val);
30
31        return check(root.left, k, set) ||
32               check(root.right, k, set);
33    }
34}