class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
         List<List<Integer>> ans = new ArrayList<>();
        
        for(int k=0;k<=nums.length-2;k++){
            int i=k+1;
            int j=nums.length-1;
            if(k>0 && nums[k]==nums[k-1]) continue;
            while(i<j){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    ArrayList<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                    i++;
                    j--;
                    while(i>0  && i<j &&  nums[i]==nums[i-1]) i++;
                    while(j<nums.length-1  && i<j &&  nums[j]==nums[j+1]) j--;
                }
              else  if(sum>0){
                    j--;
                }
                else{
                    i++;
                }
            }
       }
       return ans;
     }
  }