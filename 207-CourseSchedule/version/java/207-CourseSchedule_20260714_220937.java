// Last updated: 14/07/2026, 22:09:37
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22
23    HashMap<Node, Node> map = new HashMap<>();
24
25    public Node cloneGraph(Node node) {
26        if (node == null)
27            return null;
28
29        if (map.containsKey(node))
30            return map.get(node);
31
32        Node copy = new Node(node.val);
33        map.put(node, copy);
34
35        for (Node nei : node.neighbors) {
36            copy.neighbors.add(cloneGraph(nei));
37        }
38
39        return copy;
40    }
41}