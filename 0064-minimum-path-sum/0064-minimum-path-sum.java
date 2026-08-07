class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int [][] dp=new int[n][m];
        int ans=0;
        for(int i=0;i<m;i++){
         dp[0][i]=ans+grid[0][i];
         ans=ans+grid[0][i];
        }
        ans=0;
        for(int i=0;i<n;i++){
         dp[i][0]=ans+grid[i][0];
         ans=ans+grid[i][0];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
         return dp[n-1][m-1];
        
    }
}