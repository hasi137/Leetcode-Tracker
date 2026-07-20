// Last updated: 20/07/2026, 23:24:25
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3
4public class Solution extends VersionControl {
5    public int firstBadVersion(int n) {
6        int l = 1, r = n;
7
8        while (l < r) {
9            int mid = l + (r - l) / 2;
10
11            if (isBadVersion(mid))
12                r = mid;
13            else
14                l = mid + 1;
15        }
16
17        return l;
18    }
19}