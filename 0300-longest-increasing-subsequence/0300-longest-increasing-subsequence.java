class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[j],dp[i]);
                }
            }
            dp[i]=1+dp[i];
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            ans=Math.max(ans,dp[i]);
        }
        return ans;
        
    }
}