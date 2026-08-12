class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k==0 || nums.length==1) return;
        ArrayList<Integer> list=new ArrayList<>();
        int r=nums.length-k;
        for(int i=r;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<=r;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
        
    }
}