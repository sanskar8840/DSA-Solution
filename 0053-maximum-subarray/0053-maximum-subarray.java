class Solution {
    public int maxSubArray(int[] nums) {
        int max=0;
        int cur =0;
        for(int i=0;i<nums.length;i++){
            cur=cur+nums[i];
            if(cur<0){
                cur=0;
            }
        max=Math.max(max,cur);
        }
        if(max==0 && cur==0){
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
         return max;
        
    }
}