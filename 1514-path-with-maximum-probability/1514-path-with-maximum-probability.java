class Solution {

    public class pair implements Comparable<pair> {
        int node;
        double prob;

        pair(int node, double prob) {
            this.node = node;
            this.prob = prob;

        }

        public int compareTo(pair p) {
            return Double.compare(p.prob, this.prob);
        }
    }

    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {

        ArrayList<ArrayList<pair>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<pair>());
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double w = succProb[i];
            list.get(u).add(new pair(v, w));
            list.get(v).add(new pair(u, w));
        }
        double[] ans = new double[n];
        ans[start_node] = 1;
       
        PriorityQueue<pair> pq = new PriorityQueue<>();
         pq.add(new pair(start_node, 1));

        while (pq.size() > 0) {
            pair top = pq.remove();
            for (pair ele : list.get(top.node)) {
                double Ttime = top.prob * ele.prob;
                if (Ttime > ans[ele.node]) {
                    ans[ele.node] = top.prob * ele.prob;
                    pq.add(new pair(ele.node, top.prob * ele.prob));
                }
            }
        }

        return ans[end_node];

    }
}