// Last updated: 01/10/2026, 15:24:14
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
16import java.util.*;
17
18class Solution {
19    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
20        List<Integer> a = new ArrayList<>();
21        List<Integer> b = new ArrayList<>();
22
23        inorder(root1, a);
24        inorder(root2, b);
25
26        List<Integer> ans = new ArrayList<>();
27
28        int i = 0, j = 0;
29
30        while (i < a.size() && j < b.size()) {
31            if (a.get(i) < b.get(j)) {
32                ans.add(a.get(i));
33                i++;
34            } else {
35                ans.add(b.get(j));
36                j++;
37            }
38        }
39
40        while (i < a.size()) {
41            ans.add(a.get(i));
42            i++;
43        }
44
45        while (j < b.size()) {
46            ans.add(b.get(j));
47            j++;
48        }
49
50        return ans;
51    }
52
53    void inorder(TreeNode root, List<Integer> list) {
54        if (root == null) return;
55
56        inorder(root.left, list);
57        list.add(root.val);
58        inorder(root.right, list);
59    }
60}