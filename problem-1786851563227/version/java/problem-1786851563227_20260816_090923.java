// Last updated: 16/08/2026, 09:09:23
1class Solution {
2    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
3        int maxLight =0;
4        for(int x : lights){
5            maxLight = Math.max(maxLight,x);
6        }
7        int ans =0;
8        for(int t: arrivalTime){
9            int r = t%period;
10            if(r>= maxLight){
11                ans = Math.max(ans,period - r);
12            }       
13        }
14        return ans;
15        
16    }
17}