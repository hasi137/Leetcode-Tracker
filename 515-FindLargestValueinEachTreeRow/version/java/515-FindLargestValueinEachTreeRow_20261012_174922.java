// Last updated: 12/10/2026, 17:49:22
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
18    public List<Integer> largestValues(TreeNode root) {
19        List<Integer> ans = new ArrayList<>();
20
21        if (root == null) return ans;
22
23        Queue<TreeNode> q = new LinkedList<>();
24        q.add(root);
25
26        while (!q.isEmpty()) {
27            int size = q.size();
28            int max = Integer.MIN_VALUE;
29
30            for (int i = 0; i < size; i++) {
31                TreeNode node = q.poll();
32
33                max = Math.max(max, node.val);
34
35                if (node.left != null)
36                    q.add(node.left);
37
38                if (node.right != null)
39                    q.add(node.right);
40            }
41
42            ans.add(max);
43        }
44
45        return ans;
46    }
47}
48