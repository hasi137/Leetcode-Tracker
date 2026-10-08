// Last updated: 08/10/2026, 09:17:22
1class Solution {
2    public String frequencySort(String s) {
3        HashMap<Character, Integer> map = new HashMap<>();
4
5        for (char c : s.toCharArray())
6            map.put(c, map.getOrDefault(c, 0) + 1);
7
8        List<Character> list = new ArrayList<>(map.keySet());
9        list.sort((a, b) -> map.get(b) - map.get(a));
10
11        StringBuilder ans = new StringBuilder();
12
13        for (char c : list)
14            ans.append(String.valueOf(c).repeat(map.get(c)));
15
16        return ans.toString();
17    }
18}