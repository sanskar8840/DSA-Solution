class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int curr =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                curr+=1;
               ans= Math.max(ans,curr);
            }else{
                curr=0;
            }
        }
        return ans;
    }
}