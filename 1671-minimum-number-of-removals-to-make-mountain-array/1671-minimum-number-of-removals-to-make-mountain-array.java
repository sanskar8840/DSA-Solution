class Solution {
    public void helper1(int[] nums,int [] dp1) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp1[i] = Math.max(dp1[i], dp1[j]);
                }
            }
            dp1[i] = dp1[i] + 1;
        }
    }
      public void helper2(int[] nums,int [] dp2) {
        
        for (int i = nums.length-1; i >=0; i--) {
            for (int j = nums.length-1; j > i; j--) {
                if (nums[j] < nums[i]) {
                    dp2[i] = Math.max(dp2[i], dp2[j]);
                }
            }
            dp2[i] = dp2[i] + 1;
        }
    }
    public int minimumMountainRemovals(int[] nums) {
        // if(nums.length<=3) return 0;
        int [] dp1=new int[nums.length];
        int [] dp2=new int[nums.length];
        helper1(nums,dp1); 
        helper2(nums,dp2);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(dp1[i]+dp2[i]>ans  && dp1[i] > 1 && dp2[i] > 1)
            ans=dp1[i]+dp2[i];
        }
       return nums.length-ans+1;
    }
}