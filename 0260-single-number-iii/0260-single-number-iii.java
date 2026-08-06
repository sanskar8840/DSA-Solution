class Solution {
    public int[] singleNumber(int[] nums) {
        int [] ans=new int[2];
        HashMap<Integer,Integer> mp =new HashMap<>();
        for(int ele : nums){
            if(mp.containsKey(ele)){
                int freq=mp.get(ele);
                mp.put(ele,freq+1);
            }
            else{
                mp.put(ele,1);
            }
        }
        int i=0;
        for(Integer key : mp.keySet()){
            if(mp.get(key)==1) {
               ans[i]=key;
                i++;
            }
        }
        return ans;
        
    }
}