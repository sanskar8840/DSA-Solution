class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=i+1;
        while(j<nums.length && i<nums.length){
            if(nums[i]!=0){
                i++;
                j=i+1;
            }else if(nums[j]==0){
                j++;
            }else{
                nums[i]=nums[j];
                nums[j]=0;
                i++;
                j++;
            }
        }
        
    }
}