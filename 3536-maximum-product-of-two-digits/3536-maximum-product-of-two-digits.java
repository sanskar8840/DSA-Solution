class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        
        while(n!=0){
            int ld=n%10;
            list.add(ld);
            n=n/10;
        }
      int[] ans=new int[list.size()];
      for(int i=0;i<ans.length;i++){
        ans[i]=list.get(i);
      }
     Arrays.sort(ans);
     return ans[ans.length-1] * ans[ans.length-2];
    }
}