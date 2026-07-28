class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int count =0;
        int prifix=0;
        for(int i=0;i<nums.length;i++){
            prifix=prifix+nums[i];
            int rem =(prifix%k+k)%k;
            if(mp.containsKey(rem)){
                int freq=mp.get(rem);
                count =count +freq;
            }
             if(mp.containsKey(rem)){
                int freq=mp.get(rem);
                mp.put(rem,freq+1);
            }
            else{
                mp.put(rem,1);
            }
        }
        return count;
        
    }
}