class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int curr = 0;
        int sum = nums[0];
        int low = 0;
        int high = 0;
        while (low < nums.length) {
            if (sum >= target) {
                curr = high - low + 1;
                ans = Math.min(ans, curr);
                sum = sum - nums[low];
                low++;
            } else if ( high< nums.length-1 && sum < target) {
                high++;
                sum = sum + nums[high];
               
            } else {
                break;

            }
        }
        if(ans==Integer.MAX_VALUE) return 0;
        else  return ans;
    }

}
