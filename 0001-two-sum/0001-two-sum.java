class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> mp=new HashMap <>();
        int[] m= {-1};
        for(int i=0;i<nums.length;i++){
            int found =target -nums[i];
            if(mp.containsKey(found)){
              int[] ans={i,mp.get(found)};
                return ans;
            }
            mp.put(nums[i],i);
        }
        return m;
    }
}