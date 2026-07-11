class Solution {
    public int helper(int i,int j,StringBuilder a,StringBuilder b,int[][] dp){
        if(i==-1) return j+1;
        if(j==-1) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return helper(i-1,j-1,a,b,dp);
        else{
            int de=helper(i-1,j,a,b,dp);
            int insert= helper(i,j-1,a,b,dp);
            int replace=helper(i-1,j-1,a,b,dp);
        return dp[i][j]= 1+Math.min(de,Math.min(insert,replace));
        }
        
    }
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int[][] dp =new int[n][m];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        StringBuilder a=new StringBuilder(word1);
        StringBuilder b=new StringBuilder(word2);
        return helper(n-1,m-1,a,b,dp);


        //Apply dp
        // n->n-1 to 0;
        // m-> m-1 to 0;

    }
}