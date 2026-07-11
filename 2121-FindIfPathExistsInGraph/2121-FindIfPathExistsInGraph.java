// Last updated: 11/07/2026, 12:33:13
import java.util.*;
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        vis[source] = true;

        while (!q.isEmpty()) {
            int curr = q.poll();
            if (curr == destination) {
                return true;
            }

            for (int next : adj.get(curr)) {
                if (!vis[next]) {
                    vis[next] = true;
                    q.add(next);
                }
            }
        }

        return false;
    }
}