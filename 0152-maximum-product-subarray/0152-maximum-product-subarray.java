class Solution {
    public int maxProduct(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int ans=nums[0];
        int v1;
        int v2;
        int v3;
        for(int i=1;i<nums.length;i++){
            v1=nums[i];
            v2=nums[i]*min;
            v3=nums[i]*max;
            max=Math.max(v1,Math.max(v2,v3));
            min=Math.min(v1,Math.min(v2,v3));
            ans=Math.max(ans,max);
            
            
            
        }
        return ans;
       
        
    }
}