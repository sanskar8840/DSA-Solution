class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            List<Integer> l = new ArrayList<>();
            list.add(l);
        }
        // makr in deagree array
        int[] indegree = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            int a=prerequisites[i][1];  // a->b
            int b = prerequisites[i][0];
            list.get(a).add(b);
            indegree[b]++;
            // int a = prerequisites[i][0];
            // int b = prerequisites[i][1];

            // list.get(b).add(a);
            // indegree[a]++;
        }

        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                q.add(i);
                count++;
            }

        }
        while (q.size() > 0) {
            int front = q.remove();
            for (int ele : list.get(front)) {
                indegree[ele]--;
                if (indegree[ele] == 0) {
                    q.add(ele);
                    count++;
                }

            }
        }
        System.out.println(count);
        if (count == numCourses)
            return true;
        return false;
    }
}