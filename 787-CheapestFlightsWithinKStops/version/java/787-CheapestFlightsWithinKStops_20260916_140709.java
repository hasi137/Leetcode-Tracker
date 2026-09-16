// Last updated: 16/09/2026, 14:07:09
1import java.util.*;
2
3class Solution {
4    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
5        int[] cost = new int[n];
6
7        Arrays.fill(cost, 1000000000);
8        cost[src] = 0;
9
10        for (int i = 0; i <= k; i++) {
11            int[] temp = cost.clone();
12
13            for (int[] f : flights) {
14                int from = f[0];
15                int to = f[1];
16                int price = f[2];
17
18                if (cost[from] != 1000000000)
19                    temp[to] = Math.min(temp[to], cost[from] + price);
20            }
21
22            cost = temp;
23        }
24
25        if (cost[dst] == 1000000000)
26            return -1;
27
28        return cost[dst];
29    }
30}