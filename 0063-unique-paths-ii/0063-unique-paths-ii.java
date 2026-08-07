class Solution {
        public int helper(int r,int d,int m, int n,int[][] dp,int[][] obstacleGrid){
       
        if(r>=m || d>=n) return 0;
        if(r==m-1 && d==n-1 && obstacleGrid[r][d]==0) return 1;
         if(obstacleGrid[r][d]==1) return 0;
        if(dp[r][d]!=-1) return dp[r][d];
        int right =helper(r,d+1,m,n,dp,obstacleGrid);
        int down=helper(r+1,d,m,n,dp,obstacleGrid);
        return dp[r][d]=right + down;

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            dp[i][j]=-1;
        }
       }
        return helper(0,0,m,n,dp,obstacleGrid);
        
    }
}