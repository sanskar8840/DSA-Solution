class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int prifix=0;
        for(int i=0;i<n;i++){
            prifix=prifix+nums[i];
            if(mp.containsKey(prifix-k)){
                int freq=mp.get(prifix-k);
                count=count+freq;
            }
             if(mp.containsKey(prifix)){
                int freq=mp.get(prifix);
                mp.put(prifix,freq+1);
            }else{
                mp.put(prifix,1);

            }


        }
        return count;
        
    }
}