// Last updated: 14/07/2026, 21:40:21
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3
4        ArrayList<Integer>[] graph = new ArrayList[numCourses];
5        for (int i = 0; i < numCourses; i++)
6            graph[i] = new ArrayList<>();
7
8        int[] indegree = new int[numCourses];
9
10        for (int[] p : prerequisites) {
11            graph[p[1]].add(p[0]);
12            indegree[p[0]]++;
13        }
14
15        Queue<Integer> q = new LinkedList<>();
16
17        for (int i = 0; i < numCourses; i++) {
18            if (indegree[i] == 0)
19                q.offer(i);
20        }
21
22        int count = 0;
23
24        while (!q.isEmpty()) {
25            int cur = q.poll();
26            count++;
27
28            for (int next : graph[cur]) {
29                indegree[next]--;
30                if (indegree[next] == 0)
31                    q.offer(next);
32            }
33        }
34
35        return count == numCourses;
36    }
37}