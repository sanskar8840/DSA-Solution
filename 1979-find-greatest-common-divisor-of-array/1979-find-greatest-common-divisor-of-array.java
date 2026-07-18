class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];
        int ans=Integer.MIN_VALUE;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                ans=Math.max(ans,i);
            }


        }
        return ans;
    }
}