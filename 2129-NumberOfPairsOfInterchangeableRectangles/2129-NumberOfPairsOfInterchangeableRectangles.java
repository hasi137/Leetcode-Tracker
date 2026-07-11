// Last updated: 11/07/2026, 12:33:11
class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
       long result =0;
        Map<Double,Integer> hm = new HashMap();
        for(int[] r : rectangles){
            double ratio = (double) r[0]/r[1];
            result+=hm.getOrDefault(ratio,0);
            hm.put(ratio,hm.getOrDefault(ratio,0)+1);
        }
        return result;  
    }
} 