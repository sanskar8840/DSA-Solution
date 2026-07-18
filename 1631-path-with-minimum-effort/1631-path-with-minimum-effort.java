class Solution {
    public class pair implements Comparable<pair> {
        int row;
        int col;
        int cost;

        pair(int row, int col, int cost) {
            this.row = row;
            this.col = col;
            this.cost = cost;
        }

        public int compareTo(pair p) {
            return Integer.compare(this.cost, p.cost);
        }
    }

    public int minimumEffortPath(int[][] heights) {
        int[][] ans=new int[heights.length][heights[0].length];
        for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights[0].length;j++){
                ans[i][j]=Integer.MAX_VALUE;

            }
        }
        ans[0][0]=0;
        PriorityQueue<pair> pq=new PriorityQueue<>();
        pq.add(new pair(0,0,0));
        while(pq.size()>0){
            pair top=pq.remove();
            int i=top.row;
            int j=top.col;
            int cost=top.cost;
            if(i==heights.length-1  && j==heights[0].length){
              return  ans[heights.length-1][heights[0].length-1];
            }
            // right
            if(j+1<heights[0].length){
                int time=Math.abs(heights[i][j]-heights[i][j+1]);
                int taken=Math.max(time,top.cost);
                if(ans[i][j+1]>taken){
                    ans[i][j+1]=taken;
                    pq.add(new pair(i,j+1,taken));
                }
            }
            //left
              if(j-1>=0){
                int time=Math.abs(heights[i][j]-heights[i][j-1]);
                int taken=Math.max(time,top.cost);
                if(ans[i][j-1]>taken){
                    ans[i][j-1]=taken;
                    pq.add(new pair(i,j-1,taken));
                }
            }
            //up
              if(i-1>=0){
                int time=Math.abs(heights[i][j]-heights[i-1][j]);
                int taken=Math.max(time,top.cost);
                if(ans[i-1][j]>taken){
                    ans[i-1][j]=taken;
                    pq.add(new pair(i-1,j,taken));
                }
            }
            //dowm
              if(i+1<heights.length){
                int time=Math.abs(heights[i][j]-heights[i+1][j]);
                int taken=Math.max(time,top.cost);
                if(ans[i+1][j]>taken){
                    ans[i+1][j]=taken;
                    pq.add(new pair(i+1,j,taken));
                }
            }
        }
        
return ans[heights.length-1][heights[0].length-1];


    }
}