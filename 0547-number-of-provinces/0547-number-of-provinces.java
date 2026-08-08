class Solution {
    public void helper(ArrayList<ArrayList<Integer>> adj,boolean[] visted,int i ){
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        visted[i]=true;
        while(q.size()>0){
            int front=q.remove();
            for(int ele : adj.get(front)){
                if(visted[ele]== true) continue;
                q.add(ele);
                visted[ele]=true;
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<isConnected[0].length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    list.add(j);
                }
            }
            adj.add(list);
        }
    boolean[] visted=new boolean[isConnected.length];
    int count=0;
    
    for(int i=0;i<visted.length;i++){
        if(visted[i]==false){
            count++;
            helper(adj,visted,i);
        }
    }
    return count;


        
    }
}