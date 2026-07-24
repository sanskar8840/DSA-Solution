class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count=0;
        int ans=0;
        HashMap<Character,Integer> mp=new HashMap<>();
        int i=0;
        for(int j=0;j<s.length();j++){
            Character c=s.charAt(j);
            while(mp.containsKey(c)){
                mp.remove(s.charAt(i));
                i++;
            }
            mp.put(c,1);
            count=j-i+1;
            ans=Math.max(count,ans);
          
            
        }

        return ans;

     }
        
}


