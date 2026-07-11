class Solution {
    public String helper(int i,int j,StringBuilder a,StringBuilder b,int[][] dp){
// filling the 2D array

       for(i=1;i<=a.length();i++){
        for(j=1;j<=b.length();j++){
             if(a.charAt(i-1)==b.charAt(j-1)){
               dp[i][j]=1+dp[i-1][j-1];
            }
             else{
            dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
          }
       }
         StringBuilder lcs = new StringBuilder();

      // make lcs sring
        i=a.length();
        j=b.length();
        while(i>0 && j>0){
            if(a.charAt(i-1)==b.charAt(j-1)){
                lcs.append(a.charAt(i-1));
                i--;
                j--;
            }
            else{
                if(dp[i-1][j]>dp[i][j-1]){
                    i--;
                }
                else{
                    j--;
                }
            }
        }
       return lcs.reverse().toString();
    }

    public String shortestCommonSupersequence(String str1, String str2) {
        StringBuilder a = new StringBuilder(str1);
        StringBuilder b = new StringBuilder(str2);
        StringBuilder ans = new StringBuilder();
        
        int n = a.length();
        int m = b.length();
        int[][] dp = new int[n + 1][m + 1];
        String LCS = helper(1, 1, a, b, dp);
        int i=0;
        int j=0;
        int k=0;

        while(i<n && j<m && k<LCS.length()){
            while(a.charAt(i)!=LCS.charAt(k)){
                ans.append(a.charAt(i));
                i++;
            }
            while(b.charAt(j)!=LCS.charAt(k)){
                ans.append(b.charAt(j));
                j++;
            }
           while(     i<n && j<m && k<LCS.length() && a.charAt(i)==LCS.charAt(k) && a.charAt(i)==b.charAt(j) ){
                ans.append(a.charAt(i));
                i++;
                j++;
                k++;
            }
            
        }
        while(i<n){
            ans.append(a.charAt(i));
            i++;
        }
        while(j<m){
            ans.append(b.charAt(j));
            j++;
        }


   return ans.toString();

    }
}