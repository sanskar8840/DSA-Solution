class Solution {
    public void bfs(int i, boolean[] visted, List<List<Integer>> rooms) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while (q.size() > 0) {
            int front = q.remove();
            for (int ele : rooms.get(front)) {
                if (!visted[ele]) {
                    q.add(ele);
                    visted[ele] = true;
                }
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visted = new boolean[n];
        visted[0] = true;
        bfs(0, visted, rooms);
        for (int i = 0; i < visted.length; i++) {
            if (visted[i] == false)
                return false;
        }
        return true;

    }
}