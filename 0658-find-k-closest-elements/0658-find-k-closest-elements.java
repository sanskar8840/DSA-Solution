class Solution {
    public class pair implements Comparable<pair>{
        int idx;
        int dif;
        pair(int idx,int dif){
            this.idx=idx;
            this.dif=dif;
        }
        public int compareTo(pair p){
            if(this.dif==p.dif) return Integer.compare(this.idx, p.idx);
            else return Integer.compare(this.dif,p.dif);
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
        pq.add(new pair(arr[i],Math.abs(x-arr[i])));
        if(pq.size()>k) pq.remove();
        }
        List<Integer> list=new ArrayList<>();
        while(pq.size()>0){
            list.add(pq.remove().idx);
        }
        Collections.sort(list);
        return list;
    }
}