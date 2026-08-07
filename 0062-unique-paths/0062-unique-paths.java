class Solution { 
    public int helper(int r,int d,int m, int n,int[][] dp){
        if(r>=m || d>=n) return 0;
        if(r==m-1 && d==n-1) return 1;
        if(dp[r][d]!=-1) return dp[r][d];
        int right =helper(r,d+1,m,n,dp);
        int down=helper(r+1,d,m,n,dp);
        return dp[r][d]=right + down;

    }
    public int uniquePaths(int m, int n) {
       int[][] dp=new int[m][n];
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            dp[i][j]=-1;
        }
       }
       return helper(0,0,m,n,dp);
      

        
        
    }
}