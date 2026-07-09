class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int high=0;
        int low=0;
        int ans=Integer.MAX_VALUE;
        int sum=nums[0];
        while(high <nums.length && low <nums.length) {
            if(sum<target){
                high++;
              if(high<nums.length)  sum=sum+nums[high];
            }
            else{
                ans=Math.min(ans,high-low+1);
                sum=sum-nums[low];
                low++;
            }
            
        } 
         if(ans==Integer.MAX_VALUE) return 0;
         else return ans;

    }
}