// Last updated: 23/08/2026, 08:59:01
1class Solution {
2    public boolean isPalindromic(String s) {
3        int n = s.length();
4        int totalBits = n*8;
5        int left =0;
6        int right = totalBits - 1;
7        while(left < right){
8            int leftCharIdx = left/8;
9            int leftBitPos = left % 8;
10            int leftAscii = s.charAt(leftCharIdx);
11            int leftBit =(leftAscii >> (7 - leftBitPos)) & 1;
12
13            int rightCharIdx = right /8;
14            int rightBitPos = right % 8;
15            int rightAscii = s.charAt(rightCharIdx);
16            int rightBit = (rightAscii >> (7-rightBitPos)) & 1;
17
18            if(leftBit != rightBit){
19                return false;   
20            }
21            left++;
22            right--;
23        }
24        return true;     
25    }
26}