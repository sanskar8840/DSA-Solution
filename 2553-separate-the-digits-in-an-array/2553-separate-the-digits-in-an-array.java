class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int number=nums[i];
            String s= String.valueOf(number);
            for(int j=0;j<s.length();j++){
                int a = Character.getNumericValue(s.charAt(j));
                ans.add(a);
            }
        }
        int[] result=new int[ans.size()];
        for(int i=0;i<result.length;i++){
            result[i]=ans.get(i);
        }
        return result;
        
    }
}