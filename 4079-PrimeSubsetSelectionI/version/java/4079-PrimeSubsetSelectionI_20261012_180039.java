// Last updated: 12/10/2026, 18:00:39
1
2class Solution {
3    public List<Integer> maxPrimes(int n, int s) {
4        boolean[] prime = new boolean[n + 1];
5
6        for (int i = 2; i <= n; i++) {
7            prime[i] = true;
8        }
9
10        for (int i = 2; i * i <= n; i++) {
11            if (prime[i]) {
12                for (int j = i * i; j <= n; j += i) {
13                    prime[j] = false;
14                }
15            }
16        }
17
18        List<Integer> ans = new ArrayList<>();
19
20        for (int i = 2; i <= n; i++) {
21            if (prime[i] && i <= s) {
22                ans.add(i);
23                s -= i;
24            }
25        }
26
27        return ans;
28    }
29}
30