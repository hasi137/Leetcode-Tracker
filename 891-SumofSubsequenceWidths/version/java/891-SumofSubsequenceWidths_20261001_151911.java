// Last updated: 01/10/2026, 15:19:11
1import java.util.*;
2
3class Solution {
4    public int sumSubseqWidths(int[] nums) {
5
6        Arrays.sort(nums);
7
8        long ans = 0;
9        long power = 1;
10        int mod = 1000000007;
11
12        for (int i = 0; i < nums.length; i++) {
13
14            ans += (long) nums[i] * power;
15            ans -= (long) nums[nums.length - 1 - i] * power;
16
17            ans %= mod;
18            power = (power * 2) % mod;
19        }
20
21        return (int) ((ans + mod) % mod);
22    }
23}