// Last updated: 11/07/2026, 12:34:42
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        
        for(int i = 0;i < m+1; i++){
            for(int j = 0; j< n+1;j++){
                dp[i][j] = -1;
            }
        }
        int ans = helper(text1, text2, m, n,dp);
        return ans;

        
    }
    int helper(String text1, String text2, int m, int n, int[][]dp){
        if(m==0 || n==0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(text1.charAt(m-1) == text2.charAt(n-1)){
            int ans = 1+ helper(text1, text2, m-1, n-1,dp);
            return ans;
        }
        int ans1 = helper(text1, text2, m-1 , n,dp);
        int ans2 = helper(text1, text2, m, n-1,dp);
        dp[m][n] = Math.max(ans1,ans2);
        return dp[m][n];
    }
}