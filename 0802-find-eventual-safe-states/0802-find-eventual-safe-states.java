class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> list= new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            List<Integer> l=new ArrayList<>();
            list.add(l);
        }
        int[] inorder =new int[graph.length];
        // for(int i=0;i<graph.length;i++){
        //     int a=graph[i][0];
        //     int b=graph[i][1];
        //     list.get(a)=i;
        //     list.get(b)=i;
        // }

                    
            for (int i = 0; i < graph.length; i++) {
                for (int ele : graph[i]) {
                    list.get(ele).add(i);
                }
            }

        for(int i=0;i<graph.length;i++){
            for(int ele : graph[i]){
                inorder[i]++;
            }
        }
    Queue<Integer> q=new LinkedList<>();
    for(int i=0;i<inorder.length;i++){
        if(inorder[i]==0){
            q.add(i);
        }
    }

List<Integer> ans=new ArrayList<>();

    while(q.size()>0){
        int front=q.remove();
        ans.add(front);
        for(int ele :list.get(front) ){
            inorder[ele]--;
            if(inorder[ele]==0) q.add(ele);
        }
    }
Collections.sort(ans);
return ans;

        
    }
}