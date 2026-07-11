// Last updated: 11/07/2026, 12:36:23
class Solution {
    public int splitArray(int[] nums, int k) {
        int l = 0, r = 0;
        for (int n : nums) {
            l = Math.max(l, n);
            r += n;
        }

        while (l < r) {
            int mid = (l + r) / 2, sum = 0, parts = 1;

            for (int n : nums) {
                if (sum + n > mid) {
                    parts++;
                    sum = n;
                } else sum += n;
            }

            if (parts > k) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}