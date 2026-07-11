// Last updated: 11/07/2026, 12:39:35
class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int left = 1, right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sq = (long) mid * mid;

            if (sq == x) return mid;
            if (sq < x)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return right;
    }
}