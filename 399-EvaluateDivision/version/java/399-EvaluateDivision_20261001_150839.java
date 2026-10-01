// Last updated: 01/10/2026, 15:08:39
1import java.util.*;
2
3class Solution {
4    public double[] calcEquation(List<List<String>> equations,
5                                 double[] values,
6                                 List<List<String>> queries) {
7
8        Map<String, List<String>> graph = new HashMap<>();
9        Map<String, List<Double>> weight = new HashMap<>();
10
11        for (int i = 0; i < equations.size(); i++) {
12
13            String a = equations.get(i).get(0);
14            String b = equations.get(i).get(1);
15
16            graph.putIfAbsent(a, new ArrayList<>());
17            graph.putIfAbsent(b, new ArrayList<>());
18
19            weight.putIfAbsent(a, new ArrayList<>());
20            weight.putIfAbsent(b, new ArrayList<>());
21
22            graph.get(a).add(b);
23            weight.get(a).add(values[i]);
24
25            graph.get(b).add(a);
26            weight.get(b).add(1.0 / values[i]);
27        }
28
29        double[] ans = new double[queries.size()];
30
31        for (int i = 0; i < queries.size(); i++) {
32
33            String start = queries.get(i).get(0);
34            String end = queries.get(i).get(1);
35
36            if (!graph.containsKey(start) || !graph.containsKey(end)) {
37                ans[i] = -1.0;
38            } else {
39                ans[i] = bfs(graph, weight, start, end);
40            }
41        }
42
43        return ans;
44    }
45
46    double bfs(Map<String, List<String>> graph,
47               Map<String, List<Double>> weight,
48               String start,
49               String end) {
50
51        Queue<String> q = new LinkedList<>();
52        Queue<Double> values = new LinkedList<>();
53
54        Set<String> visited = new HashSet<>();
55
56        q.add(start);
57        values.add(1.0);
58        visited.add(start);
59
60        while (!q.isEmpty()) {
61
62            String current = q.poll();
63            double currentValue = values.poll();
64
65            if (current.equals(end)) {
66                return currentValue;
67            }
68
69            for (int i = 0; i < graph.get(current).size(); i++) {
70
71                String next = graph.get(current).get(i);
72                double value = weight.get(current).get(i);
73
74                if (!visited.contains(next)) {
75
76                    visited.add(next);
77
78                    q.add(next);
79                    values.add(currentValue * value);
80                }
81            }
82        }
83
84        return -1.0;
85    }
86}