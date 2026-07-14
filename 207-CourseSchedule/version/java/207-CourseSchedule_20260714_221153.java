// Last updated: 14/07/2026, 22:11:53
1class Trie {
2
3    class TrieNode {
4        TrieNode[] child = new TrieNode[26];
5        boolean end = false;
6    }
7
8    TrieNode root;
9
10    public Trie() {
11        root = new TrieNode();
12    }
13
14    public void insert(String word) {
15        TrieNode cur = root;
16
17        for (char c : word.toCharArray()) {
18            int i = c - 'a';
19            if (cur.child[i] == null)
20                cur.child[i] = new TrieNode();
21            cur = cur.child[i];
22        }
23
24        cur.end = true;
25    }
26
27    public boolean search(String word) {
28        TrieNode cur = root;
29
30        for (char c : word.toCharArray()) {
31            int i = c - 'a';
32            if (cur.child[i] == null)
33                return false;
34            cur = cur.child[i];
35        }
36
37        return cur.end;
38    }
39
40    public boolean startsWith(String prefix) {
41        TrieNode cur = root;
42
43        for (char c : prefix.toCharArray()) {
44            int i = c - 'a';
45            if (cur.child[i] == null)
46                return false;
47            cur = cur.child[i];
48        }
49
50        return true;
51    }
52}
53/**
54 * Your Trie object will be instantiated and called as such:
55 * Trie obj = new Trie();
56 * obj.insert(word);
57 * boolean param_2 = obj.search(word);
58 * boolean param_3 = obj.startsWith(prefix);
59 */