class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
         
        int i=0;
        int j=0;
        int s1;
        int s2;
        int e1;
        int e2;
        int a;
        int b;
        while(i<firstList.length && j<secondList.length){
            s1=firstList[i][0];
            e1=firstList[i][1];
            s2=secondList[j][0];
            e2=secondList[j][1];
        
        if(s1<=s2){
            if(e1>=s2){
                a=Math.max(s1,s2);
                b=Math.min(e1,e2);
                ArrayList<Integer> list=new ArrayList<>();
                list.add(a);
                list.add(b);
                ans.add(list);

            }
        }else{
            if(e2>=s1){
                a=Math.max(s1,s2);
                b=Math.min(e1,e2);
                ArrayList<Integer> list=new ArrayList<>();
                list.add(a);
                list.add(b);
                ans.add(list);

            }

        }
        if(e1<=e2){
            i++;
            
        }else{
            j++;
           
        }
       
        
        }
        int[][] fans=new int[ans.size()][2];
        for(int k=0;k<fans.length;k++){
            fans[k][0]=ans.get(k).get(0);
            fans[k][1]=ans.get(k).get(1);

        }
        return fans;
        
    }
}