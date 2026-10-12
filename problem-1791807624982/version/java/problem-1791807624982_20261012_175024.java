// Last updated: 12/10/2026, 17:50:24
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> children;
6
7    public Node() {}
8
9    public Node(int _val) {
10        val = _val;
11    }
12
13    public Node(int _val, List<Node> _children) {
14        val = _val;
15        children = _children;
16    }
17};
18*/
19
20
21class Solution {
22    public int maxDepth(Node root) {
23        if (root == null) return 0;
24
25        int max = 0;
26
27        for (Node child : root.children) {
28            max = Math.max(max, maxDepth(child));
29        }
30
31        return max + 1;
32    }
33}
34