// Last updated: 14/07/2026, 21:51:26
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10public class Codec {
11
12    int index = 0;
13
14    public String serialize(TreeNode root) {
15        StringBuilder sb = new StringBuilder();
16        preorder(root, sb);
17        return sb.toString();
18    }
19
20    private void preorder(TreeNode root, StringBuilder sb) {
21        if (root == null) {
22            sb.append("null,");
23            return;
24        }
25
26        sb.append(root.val).append(",");
27        preorder(root.left, sb);
28        preorder(root.right, sb);
29    }
30
31    public TreeNode deserialize(String data) {
32        String[] arr = data.split(",");
33        index = 0;
34        return build(arr);
35    }
36
37    private TreeNode build(String[] arr) {
38        if (arr[index].equals("null")) {
39            index++;
40            return null;
41        }
42
43        TreeNode root = new TreeNode(Integer.parseInt(arr[index++]));
44        root.left = build(arr);
45        root.right = build(arr);
46        return root;
47    }
48}