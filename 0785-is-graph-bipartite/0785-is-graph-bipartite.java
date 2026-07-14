class Solution {
    public boolean bfs(int i,int[] visted,int[][] graph){
        visted[i]=1;
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        while(q.size()>0){
            int front=q.remove();
            int color=visted[front];
            for(int ele : graph[front]){
                if(visted[ele]==visted[front]){
                    return false;
                }
                if(visted[ele]==-1){
                    visted[ele]=1-color;
                    q.add(ele);
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int[] visted= new int[graph.length];
        Arrays.fill(visted,-1);
        for(int i=0;i<visted.length;i++){
            if(visted[i]==-1)  {
                boolean ans= bfs(i,visted,graph);
                if(ans==false) return false;
            }
            
        }
        return true;
    }
}