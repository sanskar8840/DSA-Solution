class Solution {
    public void sortColors(int[] nums) {
        int mid=0;
        int low=0;
        int high=nums.length-1;
        for(int i=0;i<nums.length;i++){
            while(mid<=high){ 
            if(nums[mid]==2){
                //swap mid and high
              nums[mid]=nums[high];
               nums[high]=2;
               high--;
            }

           else if(nums[mid]==1){
                mid++;
            }
            else{
                nums[mid]=nums[low];
                nums[low]=0;
                low++;
                mid++;
                
            }
        }
        }
        

        
    }
}