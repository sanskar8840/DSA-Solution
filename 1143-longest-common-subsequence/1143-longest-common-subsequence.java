class Solution {
    public int helper(int n,int m,StringBuilder a,StringBuilder b,int[][] dp){
        if(n<0||m<0) return 0;
        if(dp[n][m]!=-1) return dp[n][m];
        if(a.charAt(n)==b.charAt(m)){
            return dp[n][m]= 1+helper(n-1,m-1,a,b,dp);
        }
        else{
            return dp[n][m]= Math.max(helper(n-1,m,a,b,dp),helper(n,m-1,a,b,dp));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        StringBuilder a=new StringBuilder(text1);
        StringBuilder b=new StringBuilder(text2);
        int n=a.length();
        int m=b.length();
        int[][] dp=new int[n][m];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return helper(n-1,m-1,a,b,dp);
    }
}