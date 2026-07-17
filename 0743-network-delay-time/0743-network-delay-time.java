class Solution {
    public class pair implements Comparable<pair>{
        int node;
        int time;
        pair(int node,int time){
            this.node=node;
            this.time=time;
        }
        public int compareTo(pair p){
            if(this.time==p.time) return this.node-p.node;
            return Integer.compare(this.time,p.time);
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {


        List<List<pair>> list = new ArrayList<>();
        for(int i=0;i<=n;i++){
            list.add(new ArrayList<pair>());
        }
        for(int i=0;i<times.length;i++){
            int u=times[i][0];
            int v=times[i][1];
            int w=times[i][2];
            list.get(u).add(new pair(v,w));
        }
        int[] ans = new int[n+1];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[k]=0;
        PriorityQueue<pair> pq=new PriorityQueue<>();
        pq.add(new pair (k,0));
        while(pq.size()>0){
            pair top =pq.remove();
            int node =top.node;
            int time=top.time;
            for(pair ele : list.get(node)){
                int totaltime=top.time+ele.time;
                if(totaltime<ans[ele.node]){
                    ans[ele.node]=totaltime;
                    pq.add(new pair (ele.node,totaltime));
                }
            }
        }
        int max=-1;
        for(int i=1;i<ans.length;i++){
            if(ans[i]==Integer.MAX_VALUE) return -1;
            max =Math.max(ans[i],max);
        }
        return max;
        
        
    }
}