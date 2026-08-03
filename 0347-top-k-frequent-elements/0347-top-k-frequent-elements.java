class Solution {
    public class pair implements Comparable<pair> {
        int num;
        int freq;

        pair(int num, int freq) {
            this.num = num;
            this.freq = freq;
        }

        public int compareTo(pair p) {
            return Integer.compare(this.freq, p.freq);
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(nums[i])) {
                int frq = mp.get(nums[i]);
                mp.put(nums[i], frq + 1);

            } else {
                mp.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            pq.add(new pair(entry.getKey(), entry.getValue()));
            if (pq.size() > k) {
                pq.remove();
            }
        }
        int[] ans = new int[k];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = ans[i] = pq.remove().num;
        }
        Arrays.sort(ans);
        return ans;

    }
}