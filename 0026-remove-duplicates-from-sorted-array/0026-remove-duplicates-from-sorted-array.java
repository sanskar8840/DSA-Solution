class Solution {
    public int removeDuplicates(int[] nums) {
        int[] helper =new int[nums.length];
        HashMap<Integer,Integer> mp=new HashMap<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(!mp.containsKey(nums[i])){
                helper[j]=nums[i];
                j++;
                 mp.put(nums[i],1);
            }else{
                int freq=mp.get(nums[i]);
                mp.put(nums[i],freq+1);
            }
        }
        for(int i=0;i<helper.length;i++){
            nums[i]=helper[i];
        }

        return j;  
    }
}