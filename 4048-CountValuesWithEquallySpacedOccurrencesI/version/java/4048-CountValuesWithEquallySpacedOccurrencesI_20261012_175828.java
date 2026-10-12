// Last updated: 12/10/2026, 17:58:28
1
2class Solution {
3    public int countSpecialIntegers(int[] nums) {
4        int[][] pos = new int[101][3];
5        int[] count = new int[101];
6
7        for (int i = 0; i < nums.length; i++) {
8            int x = nums[i];
9
10            if (count[x] < 3) {
11                pos[x][count[x]] = i;
12            }
13
14            count[x]++;
15        }
16
17        int ans = 0;
18
19        for (int x = 1; x <= 100; x++) {
20            if (count[x] == 3 &&
21                pos[x][0] + pos[x][2] == 2 * pos[x][1]) {
22                ans++;
23            }
24        }
25
26        return ans;
27    }
28}
29