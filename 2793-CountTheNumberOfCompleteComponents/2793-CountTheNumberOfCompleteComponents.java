// Last updated: 11/07/2026, 12:32:02
import java.util.*;

class Solution {
    int ans = 0;

    void BFS(List<Integer>[] adj, boolean[] vis, int n, int src) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        vis[src] = true;
        
        int nodecount = 0;
        int edgecount = 0;
        
        while (!q.isEmpty()) {
            int node = q.poll();
            nodecount++;
            
            for (int x : adj[node]) {
                if (vis[x] == false) {
                    q.add(x);
                    vis[x] = true;
                }
                edgecount++;
            }
        }
        if ((long) nodecount * (nodecount - 1) == edgecount) {
            ans++;
        }
    }

    public int countCompleteComponents(int n, int[][] e) {
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
    
        for (int i = 0; i < e.length; i++) {
            adj[e[i][0]].add(e[i][1]);
            adj[e[i][1]].add(e[i][0]);
        }
        
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (vis[i] == false) {
                BFS(adj, vis, n, i);
            }
        }
        
        return ans;
    }
}