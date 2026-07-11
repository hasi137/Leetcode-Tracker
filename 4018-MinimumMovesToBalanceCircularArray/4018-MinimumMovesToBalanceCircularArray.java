// Last updated: 11/07/2026, 12:31:36
class Solution {
    public long minMoves(int[] balance) {   
        int n = balance.length, neg = -1;
        long sum = 0;
        int[] arr = balance;   
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (arr[i] < 0) neg = i;
        }
        if (sum < 0) return -1;
        if (neg == -1) return 0;
        long need = -arr[neg], ans = 0;

        for (int d = 1; d < n && need > 0; d++) {
            int l = (neg - d + n) % n;
            int r = (neg + d) % n;
            if (arr[l] > 0) {
                long t = Math.min(arr[l], need);
                ans += t * d;
                need -= t;
            }
            if (need > 0 && arr[r] > 0) {
                long t = Math.min(arr[r], need);
                ans += t * d;
                need -= t;
            }
        }
        return need == 0 ? ans : -1;
    }
}
