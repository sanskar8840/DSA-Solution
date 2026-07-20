class Solution {
    public class pair implements Comparable<pair>{
        int node;
        int parent;
        int wt;
        pair(int node,int parent,int wt){
            this.node=node;
            this.parent=parent;
            this.wt=wt;
        }
        public int compareTo(pair p){
            return Integer.compare(this.wt,p.wt);
        }
    }
    public int minCostConnectPoints(int[][] points) {
        int sum=0;
        int n=points.length;
        PriorityQueue<pair> pq=new PriorityQueue<>();
        pq.add(new pair(0,-1,0));
        boolean[] vis=new boolean[n];
        while(pq.size()>0){
            pair front=pq.remove();
            
            int node=front.node;
            int parent=front.parent;
            int wt=front.wt;
            if(vis[node]==true) continue;
            sum=sum+wt;
            vis[node]=true;
            for(int i=0;i<n;i++){
                if(node==i) continue;
                if(vis[i]==true) continue;
                int x1=points[node][0];
                int y1=points[node][1];
                int x2=points[i][0];
                int y2=points[i][1];
                int dist=Math.abs(x1-x2)+Math.abs(y1-y2);
                pq.add(new pair(i,node,dist));
            }
        }
        return sum;
    }
}