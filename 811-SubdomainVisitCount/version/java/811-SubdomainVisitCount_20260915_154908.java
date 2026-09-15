// Last updated: 15/09/2026, 15:49:08
1import java.util.*;
2
3class Solution {
4    public List<String> subdomainVisits(String[] cpdomains) {
5        HashMap<String, Integer> map = new HashMap<>();
6
7        for (String s : cpdomains) {
8            String[] a = s.split(" ");
9            int count = Integer.parseInt(a[0]);
10            String domain = a[1];
11
12            map.put(domain, map.getOrDefault(domain, 0) + count);
13
14            while (domain.contains(".")) {
15                domain = domain.substring(domain.indexOf('.') + 1);
16                map.put(domain, map.getOrDefault(domain, 0) + count);
17            }
18        }
19
20        List<String> ans = new ArrayList<>();
21
22        for (String domain : map.keySet()) {
23            ans.add(map.get(domain) + " " + domain);
24        }
25
26        return ans;
27    }
28}