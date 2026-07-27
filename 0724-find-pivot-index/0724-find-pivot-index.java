class Solution {
    public int pivotIndex(int[] nums) {
         int n=nums.length;
        if(n==1) return 0;
        int prifix=0;
        int sum=0;
         for(int i=0;i<n;i++){
            sum =sum+nums[i];
        }
        int sufix;
        for(int i= 0;i<nums.length;i++){
           
            sufix=sum-prifix-nums[i];
            if(sufix==prifix){
                return i;
            }
             prifix=prifix+nums[i];
        }
        return -1;
    }
}