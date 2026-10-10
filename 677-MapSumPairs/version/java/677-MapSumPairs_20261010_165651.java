// Last updated: 10/10/2026, 16:56:51
1class MapSum {
2    HashMap<String, Integer> map = new HashMap<>();
3
4    public MapSum() {
5    }
6
7    public void insert(String key, int val) {
8        map.put(key, val);
9    }
10
11    public int sum(String prefix) {
12        int ans = 0;
13
14        for (String key : map.keySet()) {
15            if (key.startsWith(prefix))
16                ans += map.get(key);
17        }
18
19        return ans;
20    }
21}