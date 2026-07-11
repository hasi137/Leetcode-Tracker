// Last updated: 11/07/2026, 12:33:41
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum =0;
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i==j || (i+j) == n-1){
                    sum+=mat[i][j];
                }
            }
        } 
        return sum; 
    }
}          