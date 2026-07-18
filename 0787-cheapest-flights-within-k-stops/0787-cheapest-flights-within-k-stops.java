class Solution {

    public class pair implements Comparable<pair> {
        int node;
        int dist;
        int count;

        pair(int node, int dist, int count) {
            this.node = node;
            this.dist = dist;
            this.count = count;
        }

        public int compareTo(pair p) {
            return Integer.compare(this.count, p.count);
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<pair>());
        }
        for (int i = 0; i < flights.length; i++) {
            int u = flights[i][0];
            int v = flights[i][1];
            int cost = flights[i][2];
            adj.get(u).add(new pair(v, cost, 0));
        }
        int[] ans = new int[n];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[src] = 0;
        PriorityQueue<pair> pq = new PriorityQueue<>();

        pq.add(new pair(src, 0, 0));

        while (pq.size() > 0) {
            pair front = pq.remove();
            int a = front.node;
            int b = front.dist;
            int c = front.count;
            for (pair ele : adj.get(a)) {
                int a2 = ele.node;
                int b2 = ele.dist;
                int c2 = ele.count;
                int total = b + b2;
                if (total < ans[a2] && c + 1 <= k + 1) {
                    ans[a2] = total;
                    pq.add(new pair(a2, b + b2, c + 1));
                }
            }

        }

        if (ans[dst] == Integer.MAX_VALUE)
            return -1;
        else
            return ans[dst];

    }
}