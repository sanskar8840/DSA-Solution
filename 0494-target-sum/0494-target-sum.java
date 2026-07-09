class Solution {
    public int helper(int i,int[] nums, int target,int sum){
        if(i==nums.length){
            if(target==sum) return 1;
            else return 0;
        }
        return helper(i+1,nums,target,sum-nums[i])+helper(i+1,nums,target,sum+nums[i]);
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        
      return  helper(0,nums,target,sum);
    }
}