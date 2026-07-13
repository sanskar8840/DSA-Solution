class Solution {
    public void bfs(int i,boolean [] visted,int[][] isConnected){
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        visted[i]=true;
        while(q.size()>0){
            int Front= q.remove();
            for(int j=0;j<isConnected.length;j++){
                if(isConnected[Front][j]==1 && visted[j]==false ){
                    q.add(j);
                    visted[j]=true;
                }
            }
        }
    }


    public int findCircleNum(int[][] isConnected) {
        boolean [] visted=new boolean[isConnected.length];
        int count=0;
        for(int i=0;i<isConnected.length;i++){
            if(visted[i]==false){
                count++;
                bfs(i,visted,isConnected);
                
            }
        }
        return count;
    }
}