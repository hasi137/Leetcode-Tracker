// Last updated: 07/10/2026, 22:59:58
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
17    public int widthOfBinaryTree(TreeNode root) {
18        if (root == null) {
19            return 0;
20        }
21
22        Queue<TreeNode> q = new LinkedList<>();
23        Queue<Long> index = new LinkedList<>();
24
25        q.add(root);
26        index.add(0L);
27
28        long ans = 0;
29
30        while (!q.isEmpty()) {
31            int size = q.size();
32            long first = index.peek();
33            long last = first;
34
35            for (int i = 0; i < size; i++) {
36                TreeNode node = q.poll();
37                long pos = index.poll();
38
39                last = pos;
40
41                if (node.left != null) {
42                    q.add(node.left);
43                    index.add(pos * 2);
44                }
45
46                if (node.right != null) {
47                    q.add(node.right);
48                    index.add(pos * 2 + 1);
49                }
50            }
51
52            ans = Math.max(ans, last - first + 1);
53        }
54
55        return (int) ans;
56    }
57}