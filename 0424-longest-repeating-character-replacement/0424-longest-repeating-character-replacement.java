class Solution {
    public int characterReplacement(String s, int k) {
        int count = 0;
        int ans = 0;
        int i = 0;
        int def;
        int lensub;
        int max=0;
        int[] arr=new int[26];
        for (int j = 0; j < s.length(); j++) {
             arr[s.charAt(j)-'A']++;
             max=Math.max(max,arr[s.charAt(j)-'A']);

             lensub=j-i+1;
             def=lensub-max;
         
         while(def>k){
            arr[s.charAt(i)-'A']--;
            i++;
           lensub=j-i+1;
           def=lensub-max;
         }
         count=j-i+1;
         ans=Math.max(ans,count);
        }
        return ans;

    }
}