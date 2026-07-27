// Last updated: 27/07/2026, 19:45:33
1class Solution {
2    public String intToRoman(int num) {
3
4        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
5        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
6
7        StringBuilder ans = new StringBuilder();
8
9        for (int i = 0; i < value.length; i++) {
10            while (num >= value[i]) {
11                ans.append(roman[i]);
12                num -= value[i];
13            }
14        }
15
16        return ans.toString();
17    }
18}