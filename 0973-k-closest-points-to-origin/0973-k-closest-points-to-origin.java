class Solution {
    public class tripal implements Comparable<tripal>{
        int dist;
        int x;
        int y;
        tripal(int dist,int x,int y){
            this.dist=dist;
            this.x=x;
            this.y=y;
        }
        public int compareTo(tripal t){
            return Integer.compare(this.dist,t.dist);
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<tripal> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];
            int dist=(0-x)*(0-x)+(0-y)*(0-y);
            pq.add(new tripal(dist,x,y));
            if(pq.size()>k){
                pq.remove();
            }
        }
        int[][] ans=new int[k][2];
        for(int i=0;i<ans.length;i++){
            tripal top=pq.remove();
            ans[i][0]=top.x;
            ans[i][1]=top.y;
        }
        return ans;

        
    }
}