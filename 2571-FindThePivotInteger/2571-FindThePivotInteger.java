// Last updated: 11/07/2026, 12:32:52
class Solution {
    public int pivotInteger(int n) {
        int total = n * (n + 1) / 2;
        for (int x = 1; x <= n; x++)
            if (x * (x + 1) / 2 == total - (x - 1) * x / 2)
                return x;
        return -1;
    }
}

