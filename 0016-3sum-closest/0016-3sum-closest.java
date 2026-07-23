class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0;
        int max=Integer.MAX_VALUE;
        int abs=0;
        int ans=0;
        

        Arrays.sort(nums);
        for(int k=0;k<nums.length-2;k++){
            int i=k+1;
            int j=nums.length-1;
            
            while(i<j){
                sum=nums[i]+nums[j]+nums[k];
                if(target==sum) return sum;
                else if(sum>target){
                    abs=Math.abs(target-sum);
                    if(max>abs){
                        ans=sum;
                        max=abs;
                    }
                    max=Math.min(abs,max);
                    j--;
                }
                else{
                     abs=Math.abs(target-sum);
                      if(max>abs){
                        ans=sum;
                        max=abs;
                    }
                     i++;

                }
              
        }
        
    }
    return ans;
}
}