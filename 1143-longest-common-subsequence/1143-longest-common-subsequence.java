class Solution {
    public int helper(int n,int m,StringBuilder t1,StringBuilder t2,int[][] dp){
        if(n<0 ||m<0) return 0;
        if(dp[n][m]!=-1) return dp[n][m];
        if(t1.charAt(n)==t2.charAt(m)){
            return dp[n][m]= 1+helper(n-1,m-1,t1,t2,dp);
        }else{
            return dp[n][m]= Math.max(helper(n-1,m,t1,t2,dp),helper(n,m-1,t1,t2,dp));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        StringBuilder t1=new StringBuilder(text1);
        StringBuilder t2=new StringBuilder(text2);
        int n=text1.length();
        int m=text2.length();
        int [][] dp= new int[n][m];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return helper(n-1,m-1,t1,t2,dp);
    }
}