class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> q=new LinkedList<>();
        boolean[] visted=new boolean[rooms.size()];
        q.add(0);
        visted[0] = true;
        while(q.size()>0){
            int front =q.remove();
            for(int ele : rooms.get(front)){
                if(visted[ele] == true) continue;
                q.add(ele);
                visted[ele]=true;

            }
        }
        for(int i=0;i<visted.length;i++){
            if(visted[i]==false) return false;
        }
        return true;
        
    }
}