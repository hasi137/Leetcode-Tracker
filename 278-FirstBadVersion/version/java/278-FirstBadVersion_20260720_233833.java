// Last updated: 20/07/2026, 23:38:33
1class Solution {
2    public String getHint(String secret, String guess) {
3
4        int bulls = 0;
5        int cows = 0;
6
7        int[] count = new int[10];
8
9        for (int i = 0; i < secret.length(); i++) {
10
11            char s = secret.charAt(i);
12            char g = guess.charAt(i);
13
14            if (s == g) {
15                bulls++;
16            } else {
17                if (count[s - '0'] < 0)
18                    cows++;
19                if (count[g - '0'] > 0)
20                    cows++;
21
22                count[s - '0']++;
23                count[g - '0']--;
24            }
25        }
26
27        return bulls + "A" + cows + "B";
28    }
29}