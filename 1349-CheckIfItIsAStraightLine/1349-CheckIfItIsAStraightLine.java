// Last updated: 11/07/2026, 12:34:15
class Solution {
    public boolean checkStraightLine(int[][] co) {
        int x =co[0][0];
        int y =co[0][1];
        int x1 = co[1][0];
        int y1 = co[1][1];
        for(int i =2;i<co.length;i++){
            int x2=co[i][0];
            int y2=co[i][1];
            if(((x-x1)*(y2-y1))!=((y-y1)*(x2-x1))) return false;
        }
        return true;
    }
}