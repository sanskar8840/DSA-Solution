class Solution {
    public void bfs(int source,ArrayList<ArrayList<Integer>> adj, boolean[] visted){
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        while(q.size()>0){
            int front=q.remove();
            for(int ele : adj.get(front)){
                if(!visted[ele]){
                    q.add(ele);
                    visted[ele]=true;
                }
            }
        }




    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] visted = new boolean[n];
        visted[source]=true;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> arr= new ArrayList<>();
            adj.add(arr);
        }
        for(int i=0;i<edges.length;i++){
            int a=edges[i][0];
            int b=edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        bfs(source,adj,visted);
        if( visted[destination]== false) return false;
        return true;
    }
}