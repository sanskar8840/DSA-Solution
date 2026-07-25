class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int count =0;
        int ans=0;
        int[] arr=new int [1];
        int len;
        int def;
        int max=0;
        for(int j=0;j<nums.length;j++){
           if(nums[j]==0){
            arr[0]++;
           }
           while(arr[0]>k){
            if(nums[i]==0){
                arr[0]--;
                i++;
            }else{
                i++;
            }
           }
            count=j-i+1;
            ans=Math.max(ans,count);

        }
        return ans;
        
    }
}