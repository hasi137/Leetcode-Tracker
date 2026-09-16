// Last updated: 16/09/2026, 14:34:46
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
16 import java.util.*;
17
18class Solution {
19    int prev;
20    int count = 0;
21    int max = 0;
22    boolean first = true;
23
24    ArrayList<Integer> ans = new ArrayList<>();
25
26    public int[] findMode(TreeNode root) {
27        inorder(root);
28
29        int[] result = new int[ans.size()];
30
31        for (int i = 0; i < ans.size(); i++)
32            result[i] = ans.get(i);
33
34        return result;
35    }
36
37    void inorder(TreeNode root) {
38        if (root == null)
39            return;
40
41        inorder(root.left);
42
43        if (first || root.val != prev) {
44            count = 1;
45            first = false;
46        } else {
47            count++;
48        }
49
50        if (count > max) {
51            max = count;
52            ans.clear();
53            ans.add(root.val);
54        } else if (count == max) {
55            ans.add(root.val);
56        }
57
58        prev = root.val;
59
60        inorder(root.right);
61    }
62}