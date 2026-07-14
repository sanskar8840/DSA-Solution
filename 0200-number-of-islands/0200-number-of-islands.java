class Solution {
    public void bfs(int i,int j,boolean[][] visted,char[][] grid){
        visted[i][j]=true;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{i,j});
        while(q.size()>0){
            int[] front=q.remove();
            int row=front[0];
            int coll=front[1];
            if(coll+1<grid[0].length && grid[row][coll+1]=='1' && visted[row][coll+1]==false){
                q.add(new int []{row,coll+1});
                visted[row][coll+1] = true;
            }
            if(row-1>=0  && grid[row-1][coll]=='1' && visted[row-1][coll]==false){
                q.add(new int []{row-1,coll});
                visted[row-1][coll] = true;
            }
            if(row+1<grid.length  && grid[row+1][coll]=='1' && visted[row+1][coll]==false){
                q.add(new int []{row+1,coll});
                visted[row+1][coll] = true;
            }
            if(coll-1>=0 && grid[row][coll-1]=='1' && visted[row][coll-1]==false){
                q.add(new int []{row,coll-1});
                visted[row][coll-1] = true;
            }
                
            
        }
    }
    public int numIslands(char[][] grid) {
        boolean[][] visted=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(visted[i][j]==false && grid[i][j]=='1'){
                    count++;
                    bfs(i,j,visted,grid);
                   
                }
            }
        }
        return count;
    }
}