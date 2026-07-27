class Solution {
    public int pivotIndex(int[] nums) {
        int[] prifix =new int[nums.length];
        int [] safix=new int[nums.length];
        int n=nums.length;
        if(n==1) return 0;
        
        prifix[0]= 0;
        prifix[1]=nums[0];
        for(int i=2;i<nums.length;i++){
            prifix[i]=prifix[i-1]+nums[i-1];
        }
        
        safix[n-1]= 0;
        safix[n-2]=nums[n-1];
        for(int i=n-3;i>=0;i--){
            safix[i]=safix[i+1]+nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            if(prifix[i]==safix[i]) return i;
            
        }
        
        return -1;
    }
}