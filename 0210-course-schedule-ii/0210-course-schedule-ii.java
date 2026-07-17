// class Solution {
//     public int[] findOrder(int numCourses, int[][] prerequisites) {
        
//     }
// }



class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
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
        }

        List<Integer> ans=new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                q.add(i);
                ans.add(i);
            }

        }
        while (q.size() > 0) {
            int front = q.remove();
            for (int ele : list.get(front)) {
                indegree[ele]--;
                if (indegree[ele] == 0) {
                    q.add(ele);
                    ans.add(ele);
                }

            }
        }
        
        //Collections.sort(ans);
        int[] ans2= new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            ans2[i]=ans.get(i);
        }
        if(ans2.length==numCourses) return ans2;
        return new int[0];
    }
}