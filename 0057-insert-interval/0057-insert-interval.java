class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        int [][] arr=new int[intervals.length+1][2];
        for(int i=0;i<intervals.length;i++){
            arr[i][0]=intervals[i][0];
            arr[i][1]=intervals[i][1];
        }
         arr[arr.length-1][0]=newInterval[0];
         arr[arr.length-1][1]=newInterval[1];
         Arrays.sort(arr,(a,b)->a[0]-b[0]);

         int start1=arr[0][0];
         int end1=arr[0][1];
         for(int i=1;i<arr.length;i++){
            int start2=arr[i][0];
            int end2=arr[i][1];

            if(end1>=start2){
                end1=Math.max(end1,end2);
                continue;
            }
            ArrayList<Integer> list=new ArrayList<>();
            list.add(start1);
            list.add(end1);
            ans.add(list);
            start1=start2;
            end1=end2;
         }
        ArrayList<Integer> list=new ArrayList<>();
        list.add(start1);
        list.add(end1);
        ans.add(list);
        int [][] fans=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            fans[i][0]=ans.get(i).get(0);
            fans[i][1]=ans.get(i).get(1);

        }
            return fans;


    }
}