// Last updated: 11/07/2026, 12:33:35
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int ans = 0;
        int n = boxTypes.length;
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        for(int i = 0; i< n; i++){
            int num = boxTypes[i][0];
            int a = boxTypes[i][1];
            int boxTake = Math.min(num, truckSize);
            truckSize = truckSize - boxTake;
            ans+=boxTake * a;
        }
        return ans;
        
    }
}