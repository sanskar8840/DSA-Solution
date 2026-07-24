class Solution {
    public int totalFruit(int[] fruits) {
        int count=0;
        int ans=Integer.MIN_VALUE;
        Map<Integer,Integer> mp=new HashMap<>();
        int i=0;
        int k=2;
        for(int j=0;j<fruits.length;j++){
            if(!mp.containsKey(fruits[j])){
                mp.put(fruits[j],1);
            }else{
                int freq=mp.get(fruits[j]);
                mp.put(fruits[j],freq+1);
            }
            while(k<mp.size()){
                int freq=mp.get(fruits[i]);
                if(freq-1==0) mp.remove(fruits[i]);
                else mp.put(fruits[i],freq-1);
                i++;
            }
            if(k==mp.size() || k>mp.size()){
                count=j-i+1;
                ans=Math.max(count,ans);
            }
        }
        return ans;
        
    }
}