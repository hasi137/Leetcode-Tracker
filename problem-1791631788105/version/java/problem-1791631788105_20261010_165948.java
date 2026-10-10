// Last updated: 10/10/2026, 16:59:48
1
2class Solution {
3    public String mostCommonWord(String paragraph, String[] banned) {
4        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
5        String[] words = paragraph.split("\\s+");
6
7        HashSet<String> set = new HashSet<>();
8        for (String b : banned)
9            set.add(b);
10
11        HashMap<String, Integer> map = new HashMap<>();
12        String ans = "";
13        int max = 0;
14
15        for (String w : words) {
16            if (!w.isEmpty() && !set.contains(w)) {
17                int count = map.getOrDefault(w, 0) + 1;
18                map.put(w, count);
19
20                if (count > max) {
21                    max = count;
22                    ans = w;
23                }
24            }
25        }
26        return ans;
27    }
28}
29