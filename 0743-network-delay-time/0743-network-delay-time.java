class Solution {
    public class pair implements Comparable<pair> {
        int node;
        int weight;

        pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }

        public int compareTo(pair p) {
            return Integer.compare(this.weight, p.weight);

        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        
        for (int i = 0; i <= n; i++) {
            ArrayList<pair> list = new ArrayList<>();
            adj.add(list);
        }
        PriorityQueue<pair> pq = new PriorityQueue<>();
        int[] ans = new int[n + 1];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[k] = 0;
        for (int i = 0; i < times.length; i++) {
            int u = times[i][0];
            int v = times[i][1];
            int w = times[i][2];
            adj.get(u).add(new pair(v, w));
        }
        pq.add(new pair(k, 0));
        while (pq.size() > 0) {
            pair front = pq.remove();
            int node1 = front.node;
            int w1 = front.weight;
            for (pair ele : adj.get(node1)) {
                int node2 = ele.node;
                int w2 = ele.weight;
                if (w1 + w2 < ans[node2]) {
                    ans[node2] = w1 + w2;
                    pq.add(new pair(node2, w1 + w2));
                }
            }

        }
        int min = 0;
        for (int i = 1; i < ans.length; i++) {
            if (ans[i] == Integer.MAX_VALUE)
                return -1;
            min = Math.max(min, ans[i]);
        }
        return min;

    }
}