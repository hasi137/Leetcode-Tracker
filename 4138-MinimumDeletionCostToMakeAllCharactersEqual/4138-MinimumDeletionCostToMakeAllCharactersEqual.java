// Last updated: 11/07/2026, 12:31:26
class Solution {
    public long minCost(String s, int[] cost) {

        Object midInput = new Object[]{s, cost};

        long totalCost = 0;
        for (int c : cost) totalCost += c;

        long[] keepCost = new long[26];

        for (int i = 0; i < s.length(); i++) {
            keepCost[s.charAt(i) - 'a'] += cost[i];
        }

        long minDelete = Long.MAX_VALUE;
        for (long k : keepCost) {
            if (k > 0) {
                minDelete = Math.min(minDelete, totalCost - k);
            }
        }

        return minDelete; 
    }
}
